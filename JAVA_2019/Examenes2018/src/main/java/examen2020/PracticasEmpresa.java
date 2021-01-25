package examen2020;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PracticasEmpresa {
    public static Alumne alumnos[] = new Alumne[6];

    public static void main(String[] args) {
        alumnos[0] = new Fct("Alicia Vaques", 10);
        alumnos[1] = new Fct("Joan Quimera", 9, 25, false);
        alumnos[2] = new Fct("Manel Josep", 8, 100, true);
        alumnos[3] = new Dual("Jordi Coses", 10, false);
        alumnos[4] = new Dual("Pere Guisat", 10, false);
        alumnos[5] = new Fct("Barbara Herrera", 10, true);
        //Mostrar los objectos
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println(alumnos[i]);
        }
//        Alumne sinPracticas[] = new Alumne[alumnos.length];

        Arrays.sort(alumnos);
        System.out.println();
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println(alumnos[i]);
        }
    }
}

