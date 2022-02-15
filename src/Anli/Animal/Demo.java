package Anli.Animal;

public class Demo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("DD");
        cat.setAge(6);
        System.out.println(cat.getName()+"  "+cat.getAge());
        cat.cat();

        Cat cat1 = new Cat("CC",4);
        cat1.cat();

        Dog dog = new Dog();
        dog.setName("SS");
        dog.setAge(7);
        dog.dog();

    }
}
