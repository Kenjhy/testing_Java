package prueba;

public class NumMayor {
    public static void main(String[] args) {
        int[] myArray = new int[] { 28, 50, 40, 200, 20, 44, 100, 153 };
  //var myArray = [13,2,4,35,1];

        // Asumir que el mayor es el primero
        int mayor = myArray[0];
        // Recorrer arreglo y ver si no es así
        // (comenzar desde el 1 porque el 0 ya lo tenemos contemplado arriba)
        for (int x = 1; x < myArray.length; x++) {
            if (myArray[x] > mayor) {
                mayor = myArray[x];
            }
        }
        System.out.println("El mayor es: " + mayor);
    }
}
