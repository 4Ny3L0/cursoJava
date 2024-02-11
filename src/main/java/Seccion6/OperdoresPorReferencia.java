package Seccion6;

public class OperdoresPorReferencia {

    public static void main(String[] args) {
        Integer numero1 = Integer.valueOf(1200);
        Integer numero2 = 1200;


        System.out.println("Los numeros son iguales? " +  (numero1 == numero2) );
        System.out.println("Los numeros son iguales? " +  (numero1.intValue() == numero2.intValue()) );
    }
}
