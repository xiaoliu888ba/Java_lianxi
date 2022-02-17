package Anli.myException;

public class indexoutof {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        int[] arr = {1,2,3};
        System.out.println("开始");
        try {
            System.out.println(arr[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("异常:"+e.getMessage());
        }
        System.out.println("结束");
    }
}
