package org.example;

import javax.swing.*;
import java.util.Scanner;

public class SistemaNumericoScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu valor: ");
        int numero = 0;
        try {
            numero = scanner.nextInt();
        }catch (Exception e){
            System.out.println("Error debes ingresar un numero entero!!");
            main(args);
            System.exit(0);
        }
        System.out.println("El resultado de tu multiplicacion es: " + numero*2);
    }
}
