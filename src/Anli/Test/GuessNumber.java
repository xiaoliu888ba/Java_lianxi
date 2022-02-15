package Anli.Test;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100)+1;

        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("GUESSNUMBER:");
            int guessnum = scanner.nextInt();
            if (guessnum > number){
                System.out.println("大了");
            }else if (guessnum < number){
                System.out.println("小了");
            }else {
                System.out.println("对了");
                break;
            }
        }
    }
}
