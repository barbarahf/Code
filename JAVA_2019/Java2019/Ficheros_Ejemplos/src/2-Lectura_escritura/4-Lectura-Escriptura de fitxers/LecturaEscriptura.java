/*
 * Programa exemple per llegir i escriure fitxers en java.  Llegirem del fitxer
 * primes-to-100k.txt, que manté els primers fins al 100.000 (un per línia) i 
 * crearem tres fitxers de primers, ascendent.txt, descendent.txt i altres.txt.
 * Aquests fitxers mantindran 10 primers per línia.
 */

/**
 * @author José Javier Faro
 */
import java.io.*;           // Importem totes les classes

public class LecturaEscriptura {
    private static boolean isAscendent(String primer){
        if (primer.length() < 2)
            return false;
        for (int n=1; n<primer.length(); n++)
            if (primer.charAt(n-1) > primer.charAt(n))
                return false;
        return true;
    }
    
    private static boolean isDescendent(String primer){
        if (primer.length() < 2)
            return false;
        for (int n=1; n<primer.length(); n++)
            if (primer.charAt(n-1) < primer.charAt(n))
                return false;
        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // El programa espera que li passem com a paràmetre el nom del fitxer de
        // primers a separar.  Si no li passem, no pot continuar
        File fitxer = null;         // Fitxer de primers que llegirem
        boolean error = false;      // Indica si s'ha produïr un error
        if (args.length == 1){      // Li hem passat el nom del fitxer a analitzar
            try{
                fitxer = new File(args[0]);
                if (!fitxer.exists()){
                    System.out.println("El paràmetre que s'ha passat ha de correspondre amb un nom de fitxer existent al sistema");
                    System.out.println("El fitxer informat no s'ha trobat. Passi un nom de fitxer vàlid al programa per procedir");
                    error = true;
                }
            }catch (Exception e){
                System.out.println("Error accedint al sistema de fitxers");
                System.out.println(e.getMessage());
                error = true;       // No s'ha pogut accedir al sistema de fitxers?
            }
            // Podem continuar si no hi ha hagut errors
            if (!error){
                String linia;       // Línia llegida del fitxer
                // Crearem els fitxers de destí a la mateixa carpeta que l'origen
               
                // S'ha passat al programa el nom d'un fitxer existent.  Podria no tenir la sintàxis adequada
                try (BufferedReader br = new BufferedReader(new FileReader(fitxer))){
                    String path = fitxer.getParent();
                    if (path == null)
                        path = "";
                    else
                        path += "\\";
                    String ascendent = path + "ascendents.txt";
                    String descendent = path + "descendents.txt";
                    String altre = path + "altres.txt";
                    File ascendents = new File(ascendent);
                    File descendents = new File(descendent);
                    File altres = new File(altre);
                    // No comprovem si els fitxers de destí existeixen, els reescrivirem sense preguntar
                    try (PrintWriter asc = new PrintWriter(new BufferedWriter(new FileWriter(ascendents)))){
                        try (PrintWriter des = new PrintWriter(new BufferedWriter(new FileWriter(descendents)))){
                            try (PrintWriter alt = new PrintWriter(new BufferedWriter(new FileWriter(altres)))){
                                // Si estem aquí, és que tots els fitxers s'han pogut obrir normalment
                                while ((linia = br.readLine()) != null)
                                    if (isAscendent(linia))
                                        asc.println(linia);
                                    else if (isDescendent(linia))
                                        des.println(linia);
                                    else  
                                        alt.println(linia);
                                System.out.println("L'operació s'ha realitzat correctament. S'han creat els tres fitxers");
                                System.out.println("Consulti els fitxers:   ascendents.txt, descendents.txt i altres.txt");
                            }catch (Exception e){
                                System.out.println("Error indeterminat en escriure al fitxer  " + altre);
                                System.out.println("L'error reportat pel sistema és: " + e.getMessage());
                            }
                        }catch (Exception e){
                            System.out.println("Error indeterminat en escriure al fitxer  " + descendent);
                            System.out.println("L'error reportat pel sistema és: " + e.getMessage());
                        }
                    }catch (Exception e){
                        System.out.println("Error indeterminat en escriure al fitxer  " + ascendent);
                        System.out.println("L'error reportat pel sistema és: " + e.getMessage());
                    }
                }catch (Exception e){
                    System.out.println("Error indeterminat en llegir del fitxer " + fitxer);
                    System.out.println("L'error reportat pel sistema és: " + e.getMessage());
                }
            }
        }
        else{
            System.out.println("Ha de passar al programa el nom d'un fitxer de text amb valors enters positius (un per línia)");
            System.out.println("No s'han passat arguments al programa, l'execució no pot continuar");
        }
    }
}

