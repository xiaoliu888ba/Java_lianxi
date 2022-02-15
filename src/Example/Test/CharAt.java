package Example.Test;

import java.util.Scanner;

public class CharAt {
    public static void main(String[] args) {
        System.out.println("String:");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        for (int i = 0;i<line.length();i++){
            System.out.println(line.charAt(i));
        }
    }
}
