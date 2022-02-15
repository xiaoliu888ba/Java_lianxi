package Example.Test;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String ss = s.nextLine();
        System.out.println( myreverse(ss));
    }
    public static String myreverse(String s){
        String string = new StringBuilder(s).reverse().toString();
        return string;
    }
}
