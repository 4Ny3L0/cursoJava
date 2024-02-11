import java.util.Arrays;
import java.util.Scanner;

public class OrdernarNumeros {
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        int max =0;
        int []min = {};
        int number =0;
        for(int i=0; i < 2 ; i++){
        System.out.println("Ingresa un numero: ");
         number= s.nextInt();
         max = (max > number) ? max : number;
         min = Arrays.copyOf(min, min.length +1);
         min[min.length - 1] = number;

        }
        Arrays.sort(min);
        System.out.println("De los numeros ingresados el mayor es: " + max + " y el menor es : " + min[0] );
    }
}
