package Example.Test;

class student1 {
    static String school_name;             //声明静态变量
}

public class Example_static {
    public static void main(String[] args) {
        student1 s = new student1();         //创建学生对象
        student1.school_name = "某某大学";   //为静态变量复制
        System.out.println("I come form " + s.school_name);   //访问静态变量
    }
}
