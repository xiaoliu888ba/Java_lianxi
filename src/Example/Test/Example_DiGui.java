package Example.Test;

public class Example_DiGui {
    public static int getSum(int n){
        if (n==1){
            return 1;
        }else {
            int temp=getSum(n-1);
            return temp+n;
        }
    }
    public static void main(String[] args) {
        int sum=getSum(4);
        System.out.println(sum);
    }
}
