package prueba;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class OcurrenciaSecuencia3 {
    public static void main(String[] args) {
        int[] ai = {1,2,2,4,5,6,7,8,8,8};
        Map<Integer, Integer> auxNumeros = new HashMap();
        for(int num : ai) {
            if(!auxNumeros.containsKey(num)) {
                auxNumeros.put(num, 1);
            }else {
                auxNumeros.replace(num, auxNumeros.get(num) + 1);
            }
        }
        int max = Collections.max(auxNumeros.values());
        ArrayList<Integer> numMayores = new ArrayList<Integer>();
        auxNumeros.forEach((num, cant) -> {
            if(cant == max) {
                numMayores.add(num);
            }
        });
        System.out.println(numMayores);
    }
}
