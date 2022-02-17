package Anli.Test.DateTime;

import java.util.Date;

public class MyDate {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1);

        long d = 1000*60*60;
        Date d2 = new Date(d);
        System.out.println(d2);

        System.out.println(d1.getTime()*1.0/1000/60/60/24/365);

        long time =1000*60*60;
        d1.setTime(time);
        System.out.println(d1);
    }
}
