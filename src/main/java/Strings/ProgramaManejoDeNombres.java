package Strings;
import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result="";
        for (int i=0; i < 3 ; i++) {
            System.out.println("Ingresa el nombre de tu familiar: ");
            String name = scanner.nextLine().toLowerCase().trim();
            char[] nameChar = name.toCharArray();
            int nameLength = name.length();
            result = result.concat(Character.toUpperCase(nameChar[1]) + "." + nameChar[nameLength - 2] + nameChar[nameLength - 1] + "_");
        }
        String finalResult = result.substring(0, result.length() - 1);
        System.out.println("finalResult = " + finalResult);
    }
}
