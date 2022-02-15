package Example.Test;

public class Example_enum {
    public static void main(String[] args) {
        weekday1 day = weekday1.MON;
        if (day.dayvalue == 6 || day.dayvalue == 0) {
            System.out.println("Today is " + day + ". Work at home!");
        } else {
            System.out.println("Today is " + day + ". Work at office!");
        }
        System.out.println(weekday1.THU.name());
        System.out.println(weekday1.FRI.ordinal());//返回定义常量的顺序
    }
}
enum weekday1{
    MON(1, "星期一"), TUE(2, "星期二"), WED(3, "星期三"),
    THU(4, "星期四"), FRI(5, "星期五"), SAT(6, "星期六"), SUN(0, "星期日");
    public final int dayvalue;
    private final  String chinese;
    private weekday1(int dayvalue,String chinese){
        this.dayvalue=dayvalue;
        this.chinese=chinese;
    }
    @Override
    public String toString(){
        return this.chinese;
    }
}


