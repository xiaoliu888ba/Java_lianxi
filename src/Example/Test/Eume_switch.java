package Example.Test;

public class Eume_switch {
    public static void main(String[] args) {
        Weekdayy day = Weekdayy.SUN;
        switch (day){
            case MON:
            case TUE:
            case WED:
            case THU:
            case FRI:
                System.out.println("Today is " + day + ". Work at office!");
                break;
            case SAT:
            case SUN:
                System.out.println("Today is " + day + ". Work at home!");
            default:
                throw new RuntimeException("cannot process " + day);
        }
    }
}
enum Weekdayy {
    MON, TUE, WED, THU, FRI, SAT, SUN;
}