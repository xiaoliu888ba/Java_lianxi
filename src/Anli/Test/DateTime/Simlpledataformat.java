package Anli.Test.DateTime;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class Simlpledataformat {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
//
//        SimpleDateFormat sdf = new SimpleDateFormat();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));

        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String ss = "2022-11-11 11:11:11";
        Date dd = sd.parse(ss);
        System.out.println(dd);


    }
}
