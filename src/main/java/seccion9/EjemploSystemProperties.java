package seccion9;

public class EjemploSystemProperties {

    public static void main(String[] args) {
        String SystemUser = System.getProperty("user.name");
        System.out.println("SystemUser = " + SystemUser);
    }
}
