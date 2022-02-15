package Example.Test;

import java.util.Arrays;
import java.util.Random;

public class Ceshi {
    public static void main(String[] args) {
        int[] n =new int[50];
        Random r = new Random(1);
        int i = n.length-1;
        do{
            //for (int i = 0; i < 5;e i++) {
            int ran1 = r.nextInt(100);
            n[i]=ran1;
            int j = 2;
            while (ran1 % j != 0) {
                j++;
            }
            if (j == ran1) {
                System.out.println("质数：i= " + ran1);
            }
//        }
        i--;
        }while (i>0);
        System.out.println(Arrays.toString(n));
    }
}