package prueba;

import java.util.*;

public class OcurrenciaSecuencia2 {

    public static void main(String[] args) {
        int[] ai = {1, 2, 3, 4, 4, 5, 2, 5}; // Array que trataremos.
        Map<Integer, Integer> ocurrencias = new HashMap<>();

        for (int i : ai) {
            ocurrencias.merge(i, 1, Integer::sum);
        }

        ocurrencias.forEach((a, b) -> System.out.println("(" + a + ", " + b + ")"));
    }
}
