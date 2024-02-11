package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DetalleDeFactura {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner scanner = new Scanner(System.in);
        String producto="";
        double primerValor =0;
        double segundoValor =0;
        try {
            System.out.println("Ingrese el nombre de su factura: ");
            producto = scanner.nextLine();
            System.out.println("Ingrese el primer precio: ");
            primerValor = scanner.nextDouble();
            System.out.println("Ingrese el segundo precio: ");
            segundoValor = scanner.nextDouble();
        }
        catch (Exception e) {
            System.out.println("Ingresa un monto correcto por favor: ");
            main(args);
            System.exit(0);
        }

        double subTotal = primerValor + segundoValor;
        double itbms = (primerValor + segundoValor) * 0.19;
        double total = ((primerValor + segundoValor)*1.19);

        System.out.println("total = " + df.format(total));
        System.out.println("Subtotal = " + df.format(subTotal));
        System.out.println("Itbms = " + df.format(itbms));
        System.out.println("Verificacion = " +df.format(total-subTotal));
    }
}
