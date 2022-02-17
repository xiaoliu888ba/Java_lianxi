package Anli.Riqi;

import java.text.ParseException;
import java.util.Date;

public class Demo {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        String format = "yyyy年MM月dd日 HH:mm:ss";


        System.out.println(DateTools.datetoString(date,format));

        String ss = "2022-11-11 11:11:11";
        String s = "yyyy-MM-dd HH:mm:ss";
        System.out.println(DateTools.stringtoDate(ss,s));
    }
}
