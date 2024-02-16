package seccion9;

public class EjemploEjecutarPrograma {
    public static void main(String[] args) {
        Runtime rt =   Runtime.getRuntime();
        Process proceso;

        try {
        if(System.getProperty("os.name").toLowerCase().contains("windows")){
            proceso = rt.exec("notepad");
        }else{
            proceso = rt.exec("texteditor");
        }
        proceso.waitFor();
        }catch (Exception e){
            System.err.println("Se ha presentado el siguiente error "+ e);
            System.exit(1);
        }
        System.out.println("Se ha ejecutado el proceso correctamente");
    }
}
