package com.RainMan;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerSystem {
    public static void main(String[] args)  {
        ArrayList<Student> array = new ArrayList<>();
        while (true){
        System.out.println("---------------欢迎来到学生管理系统---------------");
        System.out.println("1  添加学生");
        System.out.println("2  删除学生");
        System.out.println("3  修改学生");
        System.out.println("4  查看所有学生");
        System.out.println("5  退出");
        System.out.println("请输入你的选择：");

        Scanner s = new Scanner(System.in);
        String line = s.nextLine();

        //用switch语句完成操作选择
        switch (line){
            case "1" :
                addStudent(array);
                break;
            case "2" :
                deleteStudent(array);
                break;
            case "3" :
                changeStuden(array);
                break;
            case "4" :
                chickArrayList(array);
                break;
            case "5" :
                System.out.println("谢谢使用");
                System.exit(0);//JVM退出

        }
    }
    }

    //添加方法
    public static void addStudent(ArrayList<Student> arrayList){
        Scanner scanner = new Scanner(System.in);
        String id;
        while (true) {
            System.out.println("请输入学生id");
            id = scanner.nextLine();

            boolean flag = isused(arrayList,id);
            if (flag){
                System.out.println("你输入的学号已经存在，请重新输入！！");
            }else {
                break;
            }
        }
        System.out.println("请输入学生姓名");
        String name = scanner.nextLine();
        System.out.println("请输入学生年龄");
        String age = scanner.nextLine();
        System.out.println("请输入学生地址");
        String address = scanner.nextLine();
        Student s = new Student(id,name,age,address);
        //把数据存储到集合当中去
        arrayList.add(s);
        System.out.println("添加学生成功");
    }

    //判断学号重复问题
    public static boolean isused(ArrayList<Student> arrayList , String id){
        boolean flag = false;

        for (int i=0;i <arrayList.size(); i++){
            Student a = arrayList.get(i);
            if (id.equals(a.getId())){
                flag = true;

                break;
            }
        }

        return flag;
    }

    //删除方法
    public static void deleteStudent(ArrayList<Student> arrayList){
        System.out.println("请输入你要删除的学生ID：");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();
        int index = -1;

        for (int i=0;i <arrayList.size(); i++){
            Student a = arrayList.get(i);
            if (id.equals(a.getId())){
                index = i;
                break;
            }
        }
        if (index == -1){
            System.out.println("学生不存在");
        }else {
            arrayList.remove(index);
            System.out.println("删除成功");
        }

    }

    //修改方法
    public static void changeStuden(ArrayList<Student> arrayList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要修改的学生的学号：");
        String id = scanner.nextLine();
        int index = -1;

        for (int i=0;i <arrayList.size(); i++){
            Student a = arrayList.get(i);
            if (id.equals(a.getId())){
                index = i;
                break;
            }
        }


        if (index == -1){
            System.out.println("学生不存在");
        }else {
            System.out.println("请输入学生的新姓名：");
            String name = scanner.next();
            System.out.println("请输入学生的新年龄：");
            String age = scanner.next();
            System.out.println("请输入学生的新地址：");
            String address = scanner.next();

            Student ss = new Student();
            ss.setName(name);
            ss.setAge(age);
            ss.setAddrees(address);
            ss.setId(id);

            for (int i = 0 ;i<arrayList.size();i++){
                Student student = arrayList.get(i);
                if ((id.equals(student.getId()))){
                    arrayList.set(i,ss);
                    break;
                }
            }
            System.out.println("修改成功");
        }

    }

    //查看方法
    public static void chickArrayList(ArrayList<Student> arrayList){
        if(arrayList.size() == 0){
            System.out.println("无数据，请先录入数据！");
            return;//可以让程序不执行下面的语句，跳出方法
        }
        System.out.println("ID      "+"姓名     "+"年龄      "+"居住地      ");
        for (int i=0;i<arrayList.size();i++){
            Student ss = arrayList.get(i);
            System.out.println(ss.toString());
        }
        System.out.println("查看成功");
    }
}
