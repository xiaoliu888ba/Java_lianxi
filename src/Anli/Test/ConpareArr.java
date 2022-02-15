package Anli.Test;

public class ConpareArr {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        int[] arr1 = {11,22,33,44,55};
        System.out.println("是否相同："+compare(arr,arr1));
    }
    public static boolean compare(int[] arr , int[] arr1){
        if (arr.length != arr1.length){
            return false;
        }
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] != arr1[i]){
                return false;
            }
            }
        return true;
        }
    }
