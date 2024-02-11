import java.util.Scanner;

public class TareaEncontrarNumeroMayor {
    public static void main(String []args){
        /*

        Crear una clase con el método main donde el desafío es buscar el número menor de mínimo 10 valores enteros
        , usando la clase Scanner ingresar la cantidad de números a comparar, luego utilizando una sentencia for iterar
        el numero de veces (ingresado) para pedir el numero entero, entonces se requiere:

Calcular el menor número e imprimir el valor.

Si el menor número es menor que 10, imprimir "El número menor es menor que 10!". si no, imprimir "
el numero menor es igual o mayor que 10!".
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola bienvenido/a, ingresa la cantidad de numeros a comparar: ");
        int userQuantity = sc.nextInt();
        int valueToCompare =10;
        int valueOfUser;
        for(int i=0; i < userQuantity; i++){
            System.out.println("Ingresa ahora un valor a comparar: ");
            valueOfUser = sc.nextInt();
            if( valueOfUser >= valueToCompare){
                System.out.println("El numero ingresado es igual o mayor a ".concat(Integer.toString(valueToCompare)));
            }else {
                System.out.println("El numero ingresado es menor a " + valueToCompare);
            }

        }
    }
}
