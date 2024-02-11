package org.example;

import javax.swing.*;

public class SistemaNumerico {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog("Ingresa tu valor");
        int numero = 0;
        try {
            numero = Integer.parseInt(numeroStr);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error debes ingresar un numero entero");
            main(args);
            System.exit(0);
        }
        System.out.println(numero*2);
        JOptionPane.showMessageDialog(null, "El  resultado de tu operacion es: " + numero*2);
    }
}
