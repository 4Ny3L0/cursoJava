import java.util.Scanner;

public class FlujosDeControlIf {
    public static void main(String[] args) {
        //Obtener el anio bisiesto
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor ingresa el anio a comprobar: ");
        int anio = scan.nextInt();
        
        if(anio % 4 == 0 && anio % 100 ==0 && anio % 400 == 0){
            System.out.println("El año "+ anio + " es bisiesto");
        }else if(anio % 4 == 0 && anio % 400 == 0 && anio % 100 != 0) {
            System.out.println("El año " + anio + " es bisiesto");
        }else if( anio % 4==0 && anio % 400!=0 && anio %100 !=0 ){
            System.out.println("El año " + anio + " es bisiesto");
        }else {
            System.out.println("El año "+ anio + " NO es bisiesto");
        }



    }
}
