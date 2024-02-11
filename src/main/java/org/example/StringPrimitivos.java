package org.example;

public class StringPrimitivos {
    public static void main(String[] args) {
        String numeroStr = "50";
        String doubleStr = "123.123";
        String logicStr = "TruE";

        int realInt = Integer.parseInt(numeroStr);
        double realDouble = Double.parseDouble(doubleStr);
        boolean realBoolean = Boolean.parseBoolean(logicStr);
        System.out.println("Conversion de String a int = " + realInt);
        System.out.println("Conversion de String a double = " + realDouble);
        System.out.println("Conversion de String a boolean = " + realBoolean);

        int otroInt = 59;
        double otroDouble = 123.2134;

        String intStr = Integer.toString(otroInt);
        String doubleStri = Double.toString(otroDouble);

        System.out.println("Conversion de entero a cadena = " + intStr);
        System.out.println("Conversion de double a cadena = " + doubleStri);

        intStr = String.valueOf(otroInt+1);
        doubleStri = String.valueOf(otroDouble+2);

        System.out.println("Conversion de entero a cadena = " + intStr);
        System.out.println("Conversion de double a cadena = " + doubleStri);
        
        
        int i = 1001;
        short s = (short) i;
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        float f = (float)i;
        System.out.println("f = " + f);
        double d = i;
        System.out.println("d = " + d);
    }
}
