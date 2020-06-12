//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.io.*;
//
//public class paractica5 {
//    public static boolean superHer(String line) {
//        return line.toUpperCase().contains("S");
//    }
//
//    public static void main(String[] args) {
//        File fitxer = null;
//        boolean error = false;
//        if (args.length == 1) {
//            try {
//                fitxer = new File(args[0]);
//                if (!fitxer.exists()) {
//                    System.out.println("El paràmetre que s'ha passat ha de correspondre amb un nom de fitxer existent al sistema");
//                    error = true;
//                }
//            } catch (Exception e) {
//                System.out.println("Error accedint al sistema de fitxers");
//                System.out.println(e.getMessage());
//                error = true;
//            }
//            if (!error) {
//                String lini/home/barbara/Documentos/Java/Funcionesa;
//                try (BufferedReader br = new BufferedReader(new FileReader(fitxer))) {
//                    String path = fitxer.getParent();
//                    if (path == null)
//                        path = "";
//                    else
//                        path += "\\";
//                    String superheroi = path + "superherois.txt";
//                    String dolent = path + "dolents.txt";
//                    File superherois = new File(path + "superherois.txt");
//                    File dolents = new File(dolent);
//                    if (superherois.exists() || dolents.exists()) {
//                        String arch = superherois.exists() && dolents.exists() ? (dolent + " " + superheroi) : (dolents.exists() ? dolent : superheroi);
//                        System.out.println("L'arxiu/els arxius" + arch + " ja existeix en el sistema, ha d'esborrar per poder continuar");
//                        System.exit(-1);
//                    }
//                    try (PrintWriter heroes = new PrintWriter(new BufferedWriter(new FileWriter(superherois)))) {
//                        try (PrintWriter villanos = new PrintWriter(new BufferedWriter(new FileWriter(dolents)))) {
//                            while ((linia = br.readLine()) != null) {
//                                if (superHer(linia))
//                                    heroes.println(linia);
//                                else
//                                    villanos.println(linia);
//                            }
//                            System.out.println("L'operació s'ha realitzat correctament. S'han creat els dos fitxers");
//                            System.out.println("Consulti els fitxers: " + superheroi + "  y " + dolent);
//                        } catch (Exception e) {
//                            System.out.println("Error accedint al sistema de fitxers");
//                            System.out.println(e.getMessage());
//                        }
//                    } catch (Exception e) {
//                        System.out.println("Error accedint al sistema de fitxers");
//                        System.out.println(e.getMessage());
//                    }
//                } catch (Exception e) {
//                    System.out.println("Error accedint al sistema de fitxers");
//                    System.out.println(e.getMessage());
//                }
//            }
//        } else {
//            System.out.println("Cal introduir un arxiu que contingui herois, com a paràmetre");
//            System.out.println("No s'han passat arguments al programa, l'execució no pot continuar");
//        }
//    }
//}
