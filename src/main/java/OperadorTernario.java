import java.util.Scanner;

public class OperadorTernario {
    public static void main(String []args){
        String ejemplo = 7==0 ? "es igual": "no es igual";
        System.out.println("ejemplo = " + ejemplo);

        String resultado;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu nota final:");


        double nota_final = scanner.nextDouble();

        resultado = nota_final>=4.0?"Aprobastes":"Haz un mejor ezfuerzo la proxima";
        System.out.println(resultado);
    }
}
