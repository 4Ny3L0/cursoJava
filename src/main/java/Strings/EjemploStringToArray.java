package Strings;

public class EjemploStringToArray {

    public static void main(String [] args){

    String trabalenguas = "trabalenguas";

    char[] charArray = trabalenguas.toCharArray();
    for (int i=0; i < charArray.length; i++){

        System.out.print(charArray[i]);
    }
        System.out.println("\n");
    String[] stringArr = trabalenguas.split("a");

    for (int j=0; j < stringArr.length ; j++){
        System.out.println(stringArr[j]);
    }

    }
}
