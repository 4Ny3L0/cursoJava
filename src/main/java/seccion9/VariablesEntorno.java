package seccion9;

import java.util.Map;

public class VariablesEntorno {
    public static void main(String[] args){
        System.out.println("Obteniendo variable manualmente " + System.getenv("HOMEPATH"));
        Map<String, String> varEnv = System.getenv();
        //System.out.println("Variables del sistema" + varEnv);
        for(String key: varEnv.keySet()){
            System.out.println(key + " == " + varEnv.get(key));
        }
    }

}
