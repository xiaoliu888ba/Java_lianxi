package Anli.Person;

public class Student extends Person{

    public Student(String name, int age) {
        super(name, age);
    }

    public Student() {
    }

    public void student(){
        System.out.println(super.getName()+"好好学习\n");
    }
}
