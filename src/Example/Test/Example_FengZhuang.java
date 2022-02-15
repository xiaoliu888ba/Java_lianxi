package Example.Test;
class Person1{
    private int age;
    private String name;
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("输入的年龄不对！");
        } else {
            this.age = age;
        }
    }
    public void speak(){
        System.out.println("name:"+name+", age:"+age);
    }
//
//    public void setName(String name) {
//        this.name = name;
//
//    }
}
public class Example_FengZhuang {
    public static void main(String[] args) {
        Person1 p = new Person1();
//        p.setName("Alice");
        p.setAge(-9);
        p.speak();
    }
}
