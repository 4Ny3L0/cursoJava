import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {
        maxNumber();
    }

    public static void maxNumber(){
        Scanner s = new Scanner(System.in);
        int max =0;
        System.out.println("Cuantos numeros quieres comparar? ");
        int iterations = s.nextInt();
        for(int i=0; i < iterations; i++){
            System.out.println("Ingresa un numero:");
            int number = s.nextInt();
            max = (max < number)? number: max;
        }

        System.out.println("El mayor de los numeros ingresados es: "+ max);
    }

    public static void maxNumberStatic(){
        int max =0;
        Scanner s = new Scanner(System.in);
        System.out.println("Ingresa el primer numero: ");
        int first = s.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        int second = s.nextInt();
        System.out.println("Ingresa el tercer numero: ");
        int third = s.nextInt();

        max = (first < second)? second: first;
        max =(max > third)? max:third;

        System.out.println("First number: "+first);
        System.out.println("Second number: "+ second);
        System.out.println("Third number: "+ third);
        System.out.println("The max number is: "+ max);
    }

}
