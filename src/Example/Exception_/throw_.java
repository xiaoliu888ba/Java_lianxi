package Example.Exception_;

public class throw_ {
    public static void Age(int age) throws java.lang.Exception {
        if (age <= 0){
            throw new java.lang.Exception("输入的年龄有误，必须是正整数");
        }
        else {
            System.out.println(age);

        }
    }

    public static void main(String[] args) {
        int age = -1;
        try {
            Age(age);
        }catch (java.lang.Exception e){
            System.out.println("捕获的异常信息："+ e.getMessage());
        }
    }
}
