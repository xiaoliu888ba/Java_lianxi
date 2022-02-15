package Biaozhun;

public class Studentdemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(30);
        s.setName("katte");
        s.show();

        Student s1 = new Student("Max",23);
        s1.show();
    }
}
