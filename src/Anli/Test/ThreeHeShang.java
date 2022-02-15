package Anli.Test;

import java.util.Scanner;

public class ThreeHeShang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int tempheight = (a>b?a:b);
        int maxheight = (tempheight>c?tempheight:c);
        System.out.println(maxheight);


}
}