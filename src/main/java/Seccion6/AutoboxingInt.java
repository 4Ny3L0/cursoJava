package Seccion6;

public class AutoboxingInt {

    public static void main(String [] args){
        Integer [] enteros = {1,2,3,4,5,6,7,8};
        Integer suma=0;
        for(Integer valor : enteros){

            if(valor.intValue() % 2 == 0){
                suma += valor;
            }
        }
        System.out.println(suma);
    }
}
