package Anli.Test.Student;

import org.omg.CORBA.PUBLIC_MEMBER;

import javax.swing.plaf.PanelUI;

public class Student {
    private String name;
    private String age;

    public Student(String name,String age){
        this.age=age;
        this.name=name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
            this.age=age;
    }
    public void show(){
        System.out.println(name+","+age);
    }

}
