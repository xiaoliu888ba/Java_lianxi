package Anli.Test;

import java.util.Scanner;

public class Tongj {
    public static void main(String[] args) {
        int big = 0;
        int small = 0;
        int number = 0;
        System.out.println("String:");
        Scanner scanner = new Scanner(System.in);
        String ss = scanner.nextLine();
        for (int i=0;i<ss.length();i++){
            char c = ss.charAt(i);
            if (c <='Z' && c >= 'A'){
                big++;
            }else {
            if (c <= 'z' && c >= 'a'){
                small++;
            }else {
            if (c <= '9' && c >= '0'){
                number++;
            }
            }
            }
        }
        System.out.println("big:"+big);
        System.out.println("small:"+small);
        System.out.println("number:"+number);
    }
}
