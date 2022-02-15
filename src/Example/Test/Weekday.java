package Example.Test;

public class Weekday {
    public static final int SUN = 0;
    public static final int MON = 1;
    public static final int TUE = 2;
    public static final int WED = 3;
    public static final int THU = 4;
    public static final int FRI = 5;
    public static final int SAT = 6;

    public static void main(String[] args) {
        int day=1;
        if (day == Weekday.MON || day == Weekday.SUN){
            System.out.println("work at day");
        }
        else {System.out.println("rest");}
        String color = "r";
        if (Color.RED.equals(color)) {
            // TODO:
            System.out.println(true);
        }
    }

}
class Color {
    public static final String RED = "r";
    public static final String GREEN = "g";
    public static final String BLUE = "b";
}
