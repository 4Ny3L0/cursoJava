package Strings;

public class StringMetodosEjemplos {
    public static void main(String []args){
        String nombre = "Angel";

        System.out.println("Mi nombre tiene: " + nombre.length() + " Letras");
        System.out.println("nombre.toUpperCase: " + nombre.toUpperCase() );
        System.out.println("nombre.toLowerCase: " + nombre.toLowerCase() );
        System.out.println("nombre.equals: " + nombre.equals("angel") );

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas.replace("a", "K"));
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf() = " + trabalenguas.indexOf("a"));
        System.out.println("trabalenguas.lastIndexOf() = " + trabalenguas.lastIndexOf("a"));
        System.out.println("trabalenguas.indexOf() = " + trabalenguas.indexOf("x"));
        System.out.println("trabalenguas.indexOf() = " + trabalenguas.indexOf("t"));
    }
}
