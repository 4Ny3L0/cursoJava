package Strings;

public class StringsTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b ="b";
        String c= a;
        StringBuilder sb = new StringBuilder(a);
        long inicio = System.currentTimeMillis();
        for (int i=0; i<500; i++){

            //c = c.concat(a).concat(b).concat("\n");
            //c += a + b + "\n";
            sb.append(a).append(b).append("\n");
        }

        long fin = System.currentTimeMillis();

        System.out.println(fin - inicio + " ms");
       // System.out.println(c);
        System.out.println(sb);
    }
}
