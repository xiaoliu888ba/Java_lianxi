package Anli.Test.JiCheng.Anli;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat() {
    }
}
