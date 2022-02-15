package Example.Test;
class Student{
    private String name;
    private int score;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public Student(){
        System.out.println("这个是无参构造方法");
    }
    public Student(String name,int score){
        this.name=name;
        this.score=score;System.out.println("这个是有参构造方法");
        System.out.println("姓名："+name+"\t"+"成绩："+score);
    }
}

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Alice");
        s1.setScore(90);
        System.out.println("姓名："+s1.getName()+"\t"+"成绩："+s1.getScore());
        Student s2 = new Student("Tom",99);

}
}