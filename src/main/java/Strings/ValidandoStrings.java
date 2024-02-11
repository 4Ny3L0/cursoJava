package Strings;

import java.util.Scanner;

public class ValidandoStrings {

   public static void main(String []args){
       Scanner scanner = new Scanner(System.in);

       System.out.println("Ingresa el curso que vas a tomar:");
       String curso  = scanner.nextLine();
       boolean isNull = curso == null;
       boolean isEmpty = (curso.trim()).length() <= 0;
       if(isNull){
           System.out.println("No has seleccionado un curso todavia.");
           return;
       }
       if(isEmpty){
           System.out.println("No has seleccionado un curso todavia.");
           return;
       }
       System.out.println("Tu curso seleccionado es: " + curso.trim());
   }
}
