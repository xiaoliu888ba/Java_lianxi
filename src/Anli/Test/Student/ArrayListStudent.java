package Anli.Test.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListStudent {
    public static void main(String[] args) {

        ArrayList<Student> arr = new ArrayList<Student>();
        Arr(arr);
        Arr(arr);
        Arr(arr);


        for (int i = 0;i<arr.size(); i++){
            Student s = arr.get(i);
            s.show();
        }
    }
    public static void Arr(ArrayList<Student> arrayList){
        Scanner s = new Scanner(System.in);
        //输入姓名
        String name = s.next();
        //输入年龄
        String age = s.next();

        //创建学生对象
        Student s1 = new Student(name,age);
        arrayList.add(s1);
    }
}
