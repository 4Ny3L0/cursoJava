package Seccion6;

import javax.swing.text.StyledEditorKit;

public class WrapperBoolean {
    public static void main(String[] args) {
        boolean boolPrimitiva = 1 > 2;

        Boolean bool1 = true;
        Boolean bool2 = Boolean.valueOf("false");
        Boolean bool3 = Boolean.valueOf(boolPrimitiva);

        System.out.println("Son iguales? " + (bool1 == bool2));
        System.out.println("Son iguales? " + (bool1 == bool3));
        System.out.println("Son iguales? " + (bool3 == bool2));

    }
}
