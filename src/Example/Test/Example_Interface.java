package Example.Test;
//接口中可以包含三类方法：静态方法，抽象方法，默认方法
//静态方法的调用方式 “接口名.方法名”
//抽象方法和默认方法：只能通过实现类的实例对象来调用

//定义Animal接口
interface Anima {
    int ID = 1;//全局常量
    void breath();//抽象方法breath()
    //定义一个默认方法
    default void getType(String typr) {
        System.out.println("该动物属于：" + typr);
    }
    //定义一个静态方法
    static int getID() {
        return Anima.ID;
    }
}

//定义了LandAnima接口并继承Anima接口
interface LandAnima extends Anima{
    void run();
}
//Dogg类通过 implement 关键字实现Anima接口
class Dogg implements LandAnima {
    public void breath() {    //实现breath()方法
        System.out.println("狗在呼吸");
    }
    public void run(){    //实现run()方法
        System.out.println("它在地上跑呢");
    }
}

public class Example_Interface {
    public static void main(String[] args) {
        System.out.println(Anima.getID()); //通过接口名调用类方法
        Dogg dogg = new Dogg();            //创建Dogg类的实例对象
        System.out.println(dogg.ID);       //在实现类中获取接口全局变量
        dogg.breath();                     //调用Dogg对象的breath（）方法
        dogg.getType("犬科");  //通过接口是实现类Dogg的实例化对象，调用接口默认方法
        dogg.run();
    }
}
