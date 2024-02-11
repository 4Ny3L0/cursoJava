import javax.swing.*;

public class TareaObtenerNombreLargo {
    public static void main(String[] args) {
        String [] name1 = JOptionPane.showInputDialog("Ingresa tu nombre y apellido: ").split(" ");
        String [] name2 = JOptionPane.showInputDialog("Ingresa otro nombre y apellido: ").split(" ");
        String [] name3 = JOptionPane.showInputDialog("Ingresa el tercer nombre: ").split(" ");
        int name1l = name1[0].length();
        int name2l = name2[0].length();
        int name3l = name3[0].length();

       if(name1l > name2l && name1l > name3l){
           System.out.println(name1[0] + " "+ name1[1] + " tiene el nombre mas largo.");
       } else if (name2l > name1l && name2l > name3l) {
           System.out.println(name2[0] + " "+ name2[1] + " tiene el nombre mas largo.");
       }else {
           System.out.println(name3[0] + " "+ name3[1] + " tiene el nombre mas largo.");
       }
    }
}