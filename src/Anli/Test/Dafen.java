package Anli.Test;

import java.util.Scanner;

public class Dafen {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        for ( int x = 0 ; x < arr.length;x++){
            System.out.println("请输入第"+(x + 1)+"个评委的分数");
            arr[x]=sc.nextInt();
        }
        int max = getMax(arr);
        int min = getMin(arr);
        int sum = getSum(arr);
        int averger = (sum-max-min)/(arr.length-2);
        System.out.println("评分："+averger);
    }
    public static int getMax(int[] arr){
        int max = arr[0];
        for ( int i=0 ; i < arr.length;i ++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] arr){
        int min = arr[0];
        for ( int i=0 ; i < arr.length;i ++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    public static int getSum(int[] arr){
        int sum = 0;
        for (int x = 0 ; x<arr.length ;x++){
            sum += arr[x];
            }
        return sum;
        }
}
