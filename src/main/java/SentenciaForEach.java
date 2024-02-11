import javax.swing.*;

public class SentenciaForEach {

    public static void main(String[] args) {
        String [] names = {"Angel", "Lariza", "Amberlyn", "Ximena", "Carlitos" };
        forName:
        for(String name : names){
            if(name.equalsIgnoreCase("Lariza")){
                JOptionPane.showMessageDialog(null, "El amor de mi vida ".concat(name));
                break;
            }else{
                JOptionPane.showMessageDialog(null, "El amor de mi vida no lo he encontrado todavia");
            }

        }
    }
}
