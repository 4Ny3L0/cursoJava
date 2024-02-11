import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String [] args){
        String [] names = {"Angel", "Lariza", "Amberlyn", "Ximena", "Carlitos" };

        String userInpt = JOptionPane.showInputDialog("Ingresa el nombre a buscar: ");
        System.out.println(userInpt);

        int count = names.length;
        boolean isFound = false;
        for(int i=0; i < count; i++){
            if(names[i].equalsIgnoreCase(userInpt)) {
                isFound = true;
                break;
            }
        }
        if(isFound){
            JOptionPane.showMessageDialog(null, userInpt + " fue encontrado!! ");
        }else {
            JOptionPane.showMessageDialog(null, userInpt + " no esta en el listado de invitados");
        }
    }
}
