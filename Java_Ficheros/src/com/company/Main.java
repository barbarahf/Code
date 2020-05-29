package com.company;

import javax.swing.*;
import java.io.*;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static boolean esSeparador(char c) {
        final String separador = " ¡!&().,:¿?;";
        return separador.contains(Character.toString(c));
    }

    public static String transformaLinia(String linea) {
        String palabra = "";
        String line = "";
        for (int i = 0; i < linea.length(); i++) {
            char c = linea.charAt(i);
            if (!esSeparador(c)) {
                palabra += c;
            } else {
                if (!palabra.equals(""))
                    line += shuffle(palabra);
                line += c;
                palabra = "";
            }
        }
        if (!palabra.equals("")) {
            line += shuffle(palabra);
        }
        return line;
    }


    public static String shuffle(String string) {
        List<String> letters = Arrays.asList(string.split(""));
        Collections.shuffle(letters.subList(1, letters.size() - 1));
        String shuffled = "";
        for (String letter : letters) {
            shuffled += letter;
        }
        return shuffled;
    }

    public static void main(String[] args) {
        JFileChooser selector = new JFileChooser();
        selector.showOpenDialog(null);
        selector.setFileSelectionMode(JFileChooser.FILES_ONLY);
        if (selector.getSelectedFile() != null) {
            File fitxer = selector.getSelectedFile();
            try {
                File newName;
                if (fitxer.exists()) {
                    String path = fitxer.getParent();
                    int indice = fitxer.getName().lastIndexOf('.');
                    String s = fitxer.getName().substring(0, indice);
                    if (path == null)
                        path = "";
                    else
                        path += "//";
                    newName = new File(path + s + ".bak");
                    if (newName.exists()) {
                        throw new Exception("El archivo se encuentra en el sistema, eliminelo antes de acontinuar.");
                    } else {
                        Files.move(Paths.get(fitxer.getAbsolutePath()), Paths.get(newName.getAbsolutePath()), StandardCopyOption.ATOMIC_MOVE);
                    }
                } else {
                    throw new Exception("El archivo " + fitxer.getName() + "no existe.");
                }
                String linea;
                try (BufferedReader br = new BufferedReader(new FileReader(newName))) {
                    try (PrintWriter es = new PrintWriter(new BufferedWriter(new FileWriter(fitxer)))) {

                        while ((linea = br.readLine()) != null) {
                            es.println(transformaLinia(linea));
                        }
                        System.out.println("¡Archivo copiado exitosamente!");
                    } catch (Exception e) {
                        System.out.println("Error accedint al sistema de fitxers");
                        System.out.println(e.getMessage());
                    }

                } catch (Exception e) {
                    System.out.println("Error accedint al sistema de fitxers");
                    System.out.println(e.getMessage());
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Error inesperat !");
            }
        }
    }
}
