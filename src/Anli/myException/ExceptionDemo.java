package Anli.myException;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("输入");
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();

        Teacher t1 = new Teacher();
        try {
            t1.chechsorce(i);
        } catch (SorceException e) {
            e.printStackTrace();
        }
    }
}
