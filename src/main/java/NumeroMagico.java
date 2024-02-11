import java.util.Random;
import java.util.Scanner;

public class NumeroMagico {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int magicNumber = rand.nextInt(10) +1;

        System.out.println("Bienvenido al juego del numero magico, ingresa el numero que consideres, del 1 al 10:");
        int userNumber=0;
        boolean win = false;
        int attemps = 3;
        while (attemps > 0){
            System.out.println("Ingresa tu numero: ");
            userNumber = sc.nextInt();
            if(userNumber == magicNumber) {
                win=true;
                attemps = 0;
                break;
            }else{
                System.out.println("Uy no este no es el numero magico, te quedan " + (attemps - 1) + " intentos");
            }
            attemps--;
        }

        if(win){
            System.out.println("Felicidades fuistes el ganador, tienes poderes mentales. el numero magico es: " + magicNumber + " tu numero ingresado: " + userNumber);
        }else {
            System.out.println("Lo sentimos no pudistes adivinar, suerte para la proxima. El numero magico era: "+ magicNumber);
        }
    }
}
