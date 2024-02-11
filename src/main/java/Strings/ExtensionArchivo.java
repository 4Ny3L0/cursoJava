package Strings;

public class ExtensionArchivo {
    public static void main(String[] args) {
        String archivo = "arial.mkv";
        String fileExtension = archivo.substring(archivo.lastIndexOf(".")+1, archivo.length());
        System.out.println("La extension del archivo es = " + fileExtension);
    }
}
