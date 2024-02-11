import java.util.Scanner;

public class FlujoDeControlSwitch {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu numero: ");
        int num = sc.nextInt();


        switch (num) {
            case 1:
                System.out.println("tu numero esta disponible");
                break;
            case 2:
                System.out.println("Tu numero esta disponible..");
                break;
            case 6:
                System.out.println("Tu numero esta disponible...");
                break;
            default:
                System.out.println("Este numero no esta disponible");
        }


    }
}
