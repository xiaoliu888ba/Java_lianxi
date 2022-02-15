package Example.Exception_;

public class Exception1 {
//    public static int de(int a ,int b){
//    try {
//        int result = a / b;
//        return result;}
//    catch (java.lang.Exception e)//对异常进行捕获
//    {
//        System.out.println("异常信息："+e.getMessage());
////        e.printStackTrace();
//    }
//    finally {
//        System.out.println("不管是否异常，finall代码块都要执行");
//    }
//    return -1;//定义当程序发生异常返回-1
//}
//    public static void main(String[] args) {
//        int result = de(3,0);
//        if (result == -1){
//            System.out.println("程序发生异常");
//        }
//        else {
//            System.out.println(result);
//        }
//    }
//
//}
public static int de(int a ,int b) throws java.lang.Exception {
    int result = a/b;
    return result;
}

    public static void main(String[] args)  {
        try {
            int result = de(2,0);
            System.out.println(result);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }

    }
}