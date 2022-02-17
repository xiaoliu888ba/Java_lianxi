package Anli.Riqi;

import Anli.Test.DateTime.Simlpledataformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTools {
//    public static void main(String[] args) throws ParseException {
//
//        Date date = new Date();
//        String format = "yyyy年MM月dd日 HH:mm:ss";
//        System.out.println(datetoString(date,format));
//
//        String ss = "2022-11-11 11:11:11";
//        String s = "yyyy-MM-dd HH:mm:ss";
//        System.out.println(stringtoDate(ss,s));
//}
    private DateTools(){}

    public static String datetoString(Date date , String format){

        String s = "" ;
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        s = sdf.format(date);
        return s;
    }

    public static Date stringtoDate(String s  , String format) throws ParseException {
        SimpleDateFormat ss = new SimpleDateFormat(format);
        Date date1 = ss.parse(s);
        return date1;
    }
}
