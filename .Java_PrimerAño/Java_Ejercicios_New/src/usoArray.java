import java.util.Arrays;

public class usoArray {
    public static void main(String[] args) {
        int math[][] = {{1, 2, 3, 5}, {5, 6, 7, 8}};
        System.out.println(math[1][2]);
        math[1][1] = 12;
        for (int i = 0; i < 2; i++) {
            System.out.println(" ");
            for (int j = 0; j < 4; j++) {
                System.out.print(math[i][j]);
            }
        }
        int[] math2 = new int[10];
        for (int n = 0; n < math2.length; n++) {
            math2[n] = (int) Math.sqrt(n);
            System.out.println(Arrays.toString(math2));
        }
        //Ejercicios pdf
        double[] vec1 = new double[1000000];
        for (int i = 0; i < vec1.length; i++)
            vec1[i] = Math.random();
        long tiempo = System.currentTimeMillis();
        Arrays.sort(vec1);
        System.out.println("Timepo en ordenar = " + (System.currentTimeMillis() - tiempo) + "ms");
        //pdf ejercicios
        int vactor0[] = {8, 4, 5, 2, 8, 5, 12, 3};
        int vector1[] = vactor0;
        vector1[0] = 16;
        System.out.println(Arrays.toString(vactor0));
        System.out.println(Arrays.toString(vector1));
        System.out.println(vactor0 == vector1);//son iguales siempre, al modificar uno se modifican todos.
        /*Per tenir realment dos vectors amb el mateix contingut que hauríem de fer?*/
        /*Duplicar vector*/
        int[] dupliVector;
        dupliVector = new int[vactor0.length];
        for (int v = 0; v < vactor0.length; v++) {
            dupliVector[v] = vactor0[v];
        }
        System.out.println(Arrays.toString(dupliVector));
        System.out.println(dupliVector == vactor0);

    }

}
