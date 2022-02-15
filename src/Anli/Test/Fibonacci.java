package Anli.Test;

public class Fibonacci {
    public static void main(String[] args) {
        int[] arr = new int[20];
        arr[0]=1;
        arr[1]=1;
        for (int x = 2 ; x<arr.length ; x++){
            arr[x] = arr[x-1] + arr[x-2];
//            arr[19]=arr[17]+arr[18]
        }
        System.out.println("第二十个斐波那契数是："+arr[19]);
    }
}
