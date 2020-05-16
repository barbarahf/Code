import java.io.*;       // Importem les classes que necessitem
public class GravarFormat {
    // Exemple de gravació de fitxers de text amb codificacions diferents
    public static void main(String[] args) {
        try{
            String s = "äçéÑ€";      // Cadena que escriurem al fitxer
            PrintWriter pw1 = new PrintWriter("sistema.txt");
            PrintWriter pw2 = new PrintWriter("utf-8.txt","UTF-8");
            PrintWriter pw3 = new PrintWriter("utf-16.txt","UTF-16");
            PrintWriter pw4 = new PrintWriter("ISO_8859_1.txt","ISO_8859_1");
            PrintWriter pw5 = new PrintWriter("cp1252.txt","cp1252");
            PrintWriter pw6 = new PrintWriter("ISO646-US.txt","ISO646-US");
            PrintWriter pw7 = new PrintWriter("ascii.txt","ASCII");
            PrintWriter pw8 = new PrintWriter("cp850.txt","cp850");
            pw1.write(s);   pw2.write(s);   pw3.write(s);   pw4.write(s);
            pw5.write(s);   pw6.write(s);   pw7.write(s);   pw8.write(s);
            pw1.close();    pw2.close();    pw3.close();    pw4.close();
            pw5.close();    pw6.close();    pw7.close();    pw8.close();
       }catch (Exception e){
           System.out.println("ERROR:  " + e.getMessage());
       }
    }
}


