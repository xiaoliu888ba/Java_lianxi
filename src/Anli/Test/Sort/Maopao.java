package Anli.Test.Sort;


public class Maopao {

    public static void main(String[] args) {
        int[] arr = {56,432,72,12,64,77,22};
        System.out.println("排序前：");
        Maopao.ArrtoString(arr);
        System.out.println("------------------------");

        for (int i = 0 ; i<arr.length ;i ++){
            for (int j = 0 ; j < arr.length-1;j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("排序后：");
        Maopao.ArrtoString(arr);
    }


    static void ArrtoString(int[] arr){
        StringBuilder str = new StringBuilder() ;//一定要记住不能用String类型，不好搞，StringBuilder方便
        for (int i=0 ; i <arr.length; i++){
            str.append(arr[i]).append(",");
            if (i == arr.length-1 ){
                str.append("]");
                break;
            }
        }
        System.out.println("["+str);
    }
}
