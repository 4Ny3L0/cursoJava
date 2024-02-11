package seccion9;

import java.io.FileInputStream;
import java.util.Properties;

public class AsignarPropiedades {
    public static void main(String[] args) {
        try{
            FileInputStream fi = new FileInputStream("src/main/java/seccion9/ejemplo.properties");
            Properties p = new Properties(System.getProperties());
            p.load(fi);
            //System.setProperties(p);
        }catch (Exception e){
            System.out.println("Error leyendo el file" + e);
        }

        Properties properties = new Properties(System.getProperties());
        //properties.list(System.out);
        if( properties.getProperty("config.env.qa") == null ){
            System.out.println("No hay ambiente de pruebas configurado");
            return;
        }
        System.out.println("Ambiente : " + properties.getProperty("config.env.qa"));

    }
}
