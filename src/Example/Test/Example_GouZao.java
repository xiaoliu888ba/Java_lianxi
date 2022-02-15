package Example.Test;
class Person2{
    int age;
//    无参构造方法的调用
    public Person2(){
        this(222);
        System.out.println("无参构造方法的使用");
    }
    //定义有参构造方法
    public Person2(int age ) {

        this.age = age;
    }
    //定义speak()方法
    public void  speak(){
        System.out.println("我今年 "+age+" 岁");
    }
}
public class Example_GouZao {
    public static void main(String[] args) {
        Person2 p = new Person2();  //实例化Person对象
        p.speak();
    }
}
