package Anli.Person;

public class Demo {
    public static void main(String[] args) {
        Teach t1 = new Teach();
        t1.setName("AAA");
        t1.setAge(32);
        System.out.println(t1.getName()+", " +t1.getAge());
        t1.teach();

        Teach t2 = new Teach("刘",43);
        System.out.println(t2.getName()+", " +t2.getAge());
        t2.teach();

        Student s1 = new Student();
        s1.setName("BBB");
        s1.setAge(21);
        System.out.println(s1.getName()+", " +s1.getAge());
        s1.student();

        Student s = new Student("LI",23);
        System.out.println(s.getName()+", " +s.getAge());
        s.student();

    }
}
