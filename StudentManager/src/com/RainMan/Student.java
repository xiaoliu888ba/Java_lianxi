package com.RainMan;

public class Student {
    private String id;
    private String name;
    private String age;
    private String addrees;

    public Student() {
    }

    public Student(String id, String name, String age, String addrees) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.addrees = addrees;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        this.age = age;
    }

    public String getAddrees() {
        return addrees;
    }

    public void setAddrees(String addrees) {
        this.addrees = addrees;
    }

    public  String  toString(){
        return (this.id+"      "+this.name+"      "+this.age+"        "+this
                .addrees);
    }
}
