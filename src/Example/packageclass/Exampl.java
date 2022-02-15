package Example.packageclass;

public class Exampl {
    public static void main(String[] args) {
        //定义一个基本类型的变量啊，并赋值20
        int a = 20;
        //自动装箱：将基本类型的变量赋值给Integer类型的变量b
        Integer b = a;
        System.out.println(b);
        //自动拆箱：将Integer类型的变量b赋值给基本类型c
        int c = b;
        System.out.println(c);

        System.out.println(Math.abs(a));
    }
}
