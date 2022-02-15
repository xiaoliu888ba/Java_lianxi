package Anli.Animal;

public class Cat extends Animal{

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public void cat(){
        System.out.println("他会抓老鼠");
    }
}
