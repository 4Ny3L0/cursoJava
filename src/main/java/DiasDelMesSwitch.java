import java.util.Scanner;

public class DiasDelMesSwitch {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el mes que deseas validar en numeros del 1 al 12: ");
        System.out.println("Ingresa el año: ");
        int mes = sc.nextInt();
        int anio = sc.nextInt();
        int numeroDias = 0;

        switch (mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numeroDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numeroDias = 30;
                break;
            case 2:
                if(anio % 400 ==0 || anio % 4 ==0 && anio % 100 !=0){
                    numeroDias = 29;
                }else {
                    numeroDias = 28;
                }
        }
        System.out.println("El mes tiene "+ numeroDias + " Dias");
    }
}
