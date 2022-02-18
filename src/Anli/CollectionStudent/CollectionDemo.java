package Anli.CollectionStudent;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {

    public static void main(String[] args) {

        //创建collection集合对象
        Collection<Student> co = new ArrayList<>();

        //创建学生对象
        Student student = new Student("A",20);
        Student student1 = new Student("B",21);
        Student student2 = new Student("C",22);

        //把学生对象添加到集合里面去
        co.add(student);
        co.add(student1);
        co.add(student2);

        //创建Iterator对象使用里面的iterator()对象
        Iterator<Student> it= co.iterator();

        //遍历集合输出里面的学生对象
        while (it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName()+" , "+s.getAge());
        }
    }
}
