package Anli.Test.Jiekou;

public class Dog extends Animal implements Jump{
    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void jump() {
        System.out.println("狗也可以蹦跶了");
    }
}
