import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
        String userName = "Angel".toLowerCase();
        String password = "12345";
        Scanner scanner = new Scanner(System.in);
        boolean userLogged = false;
        System.out.println("Hola, ingresa tu usuario: ");
        String userInput = scanner.nextLine();
        System.out.println("Ingresa tu contraseña por favor: ");
        String passInput = scanner.nextLine();

        if(userInput.equals(userName) && passInput.equals(password)){
            userLogged = true;
        }

        if(userLogged){
            System.out.println("Bienvenido al sistema, ".concat(userInput).concat("!"));
        }else{
            System.out.println("Alguno de los datos ingresados no es correcto");
        }


    }
}
