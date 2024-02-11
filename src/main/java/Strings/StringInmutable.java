package Strings;

public class StringInmutable {
    public static void main(String[] args) {
        String curso = "Curso de java";
        String profesor = "Angel Gutierrez";
        String detalle = curso + profesor;
        System.out.println(detalle);
        
        String detalle2 = curso.concat(profesor);
        System.out.println("detalle2 = " + detalle2);
        
        
    }
}
