package seccion8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaUtilDate {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String dateFormatted = formatDate.format(date);
        System.out.println("date = " + date);
        System.out.println("month = " + date.getDate());
        System.out.println("time in mileseconds = " + date.getTime());
        System.out.println(dateFormatted);
    }
}
