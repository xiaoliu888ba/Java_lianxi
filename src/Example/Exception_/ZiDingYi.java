package Example.Exception_;

public class ZiDingYi {
    public static int div(int a ,int b) throws DiviByMinusException{
        if (b == 0){
            throw new DiviByMinusException("除数是0");
        }
        int result = a/b;
        return result;
    }

    public static void main(String[] args) {
        try {
            int result =div(2,0);
            System.out.println(result);
        }catch (DiviByMinusException e){
            System.out.println("捕获的异常信息："+e.getMessage());
        }
    }

}
