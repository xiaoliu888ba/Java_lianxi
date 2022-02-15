package Example.DateAndTime;

import java.util.Date;

public class Example {
    public static void main(String[] args) {
        Date date = new Date();
        Date date1 = new Date(System.currentTimeMillis()+1000);
        System.out.println(date);
        System.out.println(date1);
    }
}
