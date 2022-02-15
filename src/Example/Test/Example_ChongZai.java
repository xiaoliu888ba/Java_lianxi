package Example.Test;

public class Example_ChongZai {
    //三个整数相加
    public static int add(int x,int y,int z){
            return x+y+z;
    }
    //两个整数相加
    public static int add(int x,int y){
        return x+y;
    }
    //两个小数相加
    public static double add(double x,double y){
        return x+y;
    }

    public static void main(String[] args) {
        int sum1=add(5,5);
        int sum2=add(5,5,5);
        double sum3=add(1.5,1.5);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}
