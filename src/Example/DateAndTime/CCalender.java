package Example.DateAndTime;

import java.util.Calendar;

public class CCalender {
    public static void main(String[] args) throws Exception {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1;
        int date = calendar.get(Calendar.DATE);
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        System.out.println(year+"年"+month+"月"+date+"日"+hour+"时"+minute+"分"+second+"秒");

        Calendar calendar1 = Calendar.getInstance();
        calendar1.setLenient(false);
        try{ calendar1.set(Calendar.MONTH,13);
            calendar1.add(Calendar.DATE,100);
            int y = calendar1.get(Calendar.YEAR);
            int m = calendar1.get(Calendar.MONTH);
            int d = calendar1.get(Calendar.DATE);
            System.out.println("技术啊竣工时间："+y+"年"+m+"月"+d+"日");
            System.out.println(calendar.getTime());}
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
