package Example.Test;
//final修饰的类不能被继承
//final修饰的方法不能被子类重写
//final修饰的变量（成员变量和局部变量）是常量，只能被赋值一次
public class Example_final {
    final int a=23;//成员变量必须修饰时就赋值
    public static void main(String[] args) {
        final int s;//局部变量可以修饰后在赋值
        s=3;
    }
}
