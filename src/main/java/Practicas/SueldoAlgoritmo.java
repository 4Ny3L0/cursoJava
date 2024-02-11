package Practicas;

import java.util.Scanner;

public class SueldoAlgoritmo {
    public static void main(String []args){
        int age;
        double salary, sindicalTax, discount;
        double  extraDiscount = 20.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola ingresa tu edad por favor: ");
        age = sc.nextInt();
        System.out.println("Ahora tu salario actual: ");
        salary= sc.nextDouble();


        if(salary >= 30000.00){
            discount = 2.5;
        }else if(salary >= 20000 && salary <= 29999.99){
            discount = 2.0;
        }else if(salary >= 10000 && salary <= 19999.99){
            discount = 1;
        }else{
            discount = 0.5;
        }

        sindicalTax = salary * ( discount / 100);

        if(age <= 30){
            sindicalTax = (sindicalTax * extraDiscount) / 100 + sindicalTax;
        }

        System.out.println("Tu aporte al sindicato de trabajadores es: " + sindicalTax);
    }
}
