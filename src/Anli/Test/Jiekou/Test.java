package Anli.Test.Jiekou;

public class Test {
    public static void main(String[] args) {
        Animal a = new Cat();
        Jump j = new Cat();
        a.setAge(12);
        a.setName("A");
        System.out.println(a.getAge()+" "+a.getName());
        a.eat();
        j.jump();

        a = new Dog("Dog",3);
        System.out.println(a.getAge()+" "+a.getName());
        a.eat();
        j = new Dog();
        ((Dog) a).jump();

    }
}
