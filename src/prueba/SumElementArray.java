package prueba;
//https://es.stackoverflow.com/questions/368652/estoy-empezando-con-arrays-y-tengo-un-problema-con-el-siguiente-ejercicio-inten
public class SumElementArray {
    public static void main(String[] args) {

        int[] myArray = {1,3,4,2,7,0};

        for(int i=0; i<myArray.length-1; i++){
            for(int j=1;j<myArray.length;j++){
                if(myArray[i]+myArray[j]==10){
                    System.out.println(myArray[j]+" "+myArray[i]);
                }
                break;
            }
        }
    }
}
