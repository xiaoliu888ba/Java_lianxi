package Example.Test;
//boolean equals(Objest obj)    判断某个对象与此对象是否相等
//String toString()             返回该对象的字符串表示
//void finalize                 垃圾回收器调用此方法来清理没有被任何引用变量所引用对象的资源
class Animal2{
    //重写Object类的toString()方法
    public String toString(){
        return "打火机看到哈萨克";
}}
public class Example_Object {
    public static void main(String[] args) {
        Animal2 animal2 = new Animal2();
        System.out.println(animal2.toString());
    }

}
