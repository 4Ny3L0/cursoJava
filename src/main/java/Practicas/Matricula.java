package Practicas;

public class Matricula {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Angel", "Gutierrez", "Redes informaticas");
        printStudent(estudiante);
    }
    public static void printStudent(Estudiante alumno) {
        System.out.println("Bienvenido " + alumno.getStudenCompleteName());
    }

}
