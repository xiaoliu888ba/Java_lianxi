package Anli.Test;

import java.util.Scanner;

public class Jiefei {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int week = scanner.nextInt();
        if(week<1 || week >7){
            System.out.println("输入日期错误");
        }
        switch (week){
            case 1:
                System.out.println("慢跑");
                break;
            case 2:
                System.out.println("慢走");
                break;
            case 3:
                System.out.println("爬山");
                break;
            case 4:
                System.out.println("拳击");
                break;
            case 5:
                System.out.println("跳绳");
                break;
            case 6:
                System.out.println("动感单车");
                break;
            case 7:
                System.out.println("大吃一顿");
        }
    }
}
