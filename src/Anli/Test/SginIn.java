package Anli.Test;

import java.util.Scanner;

public class SginIn {
    public static void main(String[] args) {
        String username = "abc";
        String password = "123456";
        Scanner sc = new Scanner(System.in);
        System.out.println("共有三次机会！");
        for (int i = 1 ; i < 4; i++){
            System.out.println("请输入账号：");
            String inname = sc.next();
            System.out.println("请输入密码：");
            String inpassword = sc.next();
            if (inname.equals(username) && inpassword.equals(password)){
                System.out.println("登录成功");
                break;
            }
            else {
                if ((3-i)==0){
                    System.out.println("登录失败");
                }else {
                System.out.println("输入错误，第"+(3-i)+"次机会");
            }}
        }
    }
}
