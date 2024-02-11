import java.util.Scanner;

public class TareaTanqueGasolina {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Me indicas tu cantidad de combustible: ");
        double yourGas = s.nextDouble();

        if(yourGas >= 70){
            System.out.println("Estanque lleno");
            return;
        }
        if(yourGas < 70 && yourGas >= 60){
            System.out.println("Estanque casi lleno");
            return;
        }
        if(yourGas < 60 && yourGas >= 40){
            System.out.println("Estanque 3/4");
            return;
        }
        if(yourGas < 40 && yourGas >= 35){
            System.out.println("Medio estanque");
            return;
        }
        if(yourGas < 35 && yourGas >= 20){
            System.out.println("Suficiente");
            return;
        }
        System.out.println("Insuficiente");
    }
}
