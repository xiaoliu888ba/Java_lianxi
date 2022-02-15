package Anli.Test.JiCheng.Anli;
/*
    测试类
*/
public class Demo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.setAge(3);
        a.setName("加肥");
        System.out.println(a.getName()+"   "+a.getAge());
        a.eat();

        Animal d = new Dog("小黑",5);
        System.out.println(d.getName()+"  "+d.getAge());
        d.eat();
    }
}
