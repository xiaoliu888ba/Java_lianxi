package Anli.Test.DuoTai;

public class Demo {
    public static void main(String[] args) {
             Animal a = new Cat();
             a.setAge(2);
             a.setName("A");
            System.out.println(a.getName()+","+a.getAge() );
            a.eat();

            a = new Cat("A",2);
        System.out.println(a.getName()+","+a.getAge() );
        a.eat();

        Animal b = new Dog();
        b.setName("b");
        b.setAge(4);
        System.out.println(b.getName()+","+b.getAge());
        b.eat();

        b = new Dog("b",4);
        System.out.println(b.getName()+","+b.getAge());
        b.eat();
    }
}