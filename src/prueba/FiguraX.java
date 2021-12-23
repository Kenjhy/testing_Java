package prueba;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

public class FiguraX {

    public static void main(String[] args) {
        int n = 5;

        if (n == 0) {
            System.out.println("ERROR");
        } else {
            int[][] arreglo = new int[n][n];

            for (int i = 0; i < arreglo.length; i++) {
                for (int j = 0; j < arreglo.length; j++) {
                    int x = i + 1;
                    if ((i == j) || (j == (n - x))) {
                        arreglo[i][j] = 1;
                        System.out.print("X");
                    } else {
                        arreglo[i][j] = 9;
                        System.out.print("_");
                    }
                }
                System.out.println();
            }
        }
    }
}
