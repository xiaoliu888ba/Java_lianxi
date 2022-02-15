package Anli.Test.DuoTai;

public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat() {
    }

    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }

}
