package prueba;

public class OcurrenciaSecuencia {
    int[] myArray = {1, 2, 2, 4, 5, 6, 7, 8, 8, 8};

    public static void main(String[] args) {
        int[] myArray = {1, 2, 2, 4, 5, 6, 7, 8, 8, 8};
            int mayor = myArray[0];
            for(int i=1; i<myArray.length; i++){
                if(ocurrencias(mayor,myArray)<ocurrencias(myArray[i],myArray))
                     //x = ocurrencias(mayor,ai);
                    mayor = myArray[i];
                //System.out.println(ocurrencias(ai[i],ai));
            }
        System.out.println("Longest: "+ocurrencias(mayor,myArray));
        System.out.println("Number: "+ mayor);




    }

    static int ocurrencias(int n, int[]arr){
        int cuantos = 0;//contador, neutro del +
        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i])   //si n es igual al elemento i
                cuantos++;    //el contador icrementa en 1.
        }

        return cuantos;//devuelve al contador.
    }
}


