package Example.Test;

class Animal{
    String name;
    void shout(){//定义动物叫声的方法
        System.out.println(name+"ji~ji~ji~的叫");
    }
}
//定义一个Dog类继承Animal类
class Dog extends Animal{
    public void printName(){
        System.out.println("name:"+name);
    }
    //重写父类的shout()方法语法要一致
    void shout(){
        System.out.println("wangwang~~");
    }

}
public class Example_JiCheng {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name="沙皮狗";
        dog.printName();
        dog.shout();
    }
}
