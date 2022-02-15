package Example.Test;
class Animal1{
    public Animal1(String name){
        System.out.println("是一只："+name);
    }
//    void shout(){//定义动物叫声的方法
//        System.out.println(name+"ji~ji~ji~的叫");
//
}
class Dog1 extends Animal1{
    public Dog1(){
        super("二哈");//使用super()调用父类有参构造方法
    }
//    String name = "犬类";
    //重写Animal1类的shout方法
//    void shout(){
//        super.shout();
//    }
    //打印name方法
//    void printname(){
//        System.out.println("name:"+super.name);//访问父类的成员变两
//    }

}
public class Example_super {
    public static void main(String[] args) {
        Dog1 d = new Dog1();
//        d.shout();
//        d.printname();
    }
}
