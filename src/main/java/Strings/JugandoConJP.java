package Strings;

import javax.swing.*;
import java.util.Scanner;

public class JugandoConJP {
    public static  void  main(String []args){
        String curso2 = JOptionPane.showInputDialog("Ingresa tu curso seleccionado:");

        System.out.println("Ingresa el curso que vas a tomar:");

        boolean isNull = curso2 == null;
        boolean isEmpty = (curso2.trim()).length() <= 0;
        if(isNull){
            System.out.println("No has seleccionado un curso todavia.");
            return;
        }
        if(isEmpty){
            System.out.println("No has seleccionado un curso todavia.");
            return;
        }
        System.out.println("Tu curso seleccionado es: " + curso2.trim());
        JOptionPane.showMessageDialog(null,"Tu curso seleccionado es: "+curso2);
        Scanner scanner = new Scanner(System.in);
        String curso3 =  scanner.nextLine();
        System.out.println("curso3 = " + curso3);
    }

}
