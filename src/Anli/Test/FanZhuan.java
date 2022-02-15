package Anli.Test;

import java.util.Scanner;

public class FanZhuan {
    public static void main(String[] args) {
        System.out.println("String:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s);
        String s1 = fanzhuan(s);
        System.out.println(s1);
    }
    public static String fanzhuan(String s){
        String ss ="";

        for (int i = s.length()-1;i>=0;i--){
            ss += s.charAt(i);
        }

        return ss;
    }
}
