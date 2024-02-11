import java.util.Scanner;



    public class NumeroMenor {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Cantidad de numeros a comparar");
            int cantidad = scanner.nextInt();

            if (cantidad < 10) {
                System.out.println("Por favor ingrese un cantidad mayor a 10");
            } else {
                int menor = Integer.MAX_VALUE;
                int numero;

                for (int i = 0; i < cantidad; i++) {
                    System.out.println("Ingrese el numero " + (i + 1) + ": ");
                    numero = scanner.nextInt();
                    menor = (numero < menor) ? numero : menor;
                }

                System.out.println("El número menor es: " + menor);

            }
        }
    }
