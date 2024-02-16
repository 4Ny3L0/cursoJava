package seccion10;

public class EjemploClaseMath {
    public static void main(String[] args){
        int num1 = Math.abs(-3);
        System.out.println("num1 = " + num1);
        
        int num2 = Math.abs(3);
        System.out.println("num2 = " + num2);

        double min = Math.min(12.1, 123.1);
        System.out.println("min = " + min);
        
        int max = Math.max(12, 1000);
        System.out.println("max = " + max);
    }
}
