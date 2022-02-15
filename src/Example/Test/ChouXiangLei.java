package Example.Test;

public class ChouXiangLei {
    public static void main(String[] args) {
        Person p = new Ren();//抽象类不能实例化
        p.run();
    }
}
abstract class Person{
    public abstract void run();
}
class Ren extends Person{
    @Override
    public void run(){
        System.out.println("Ren.run");
    }
}