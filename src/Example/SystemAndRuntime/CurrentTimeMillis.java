package Example.SystemAndRuntime;

public class CurrentTimeMillis {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int sum =  0;
        for (int i = 0; i < 100000000;i++){
            sum += i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("运行时间  :  "+(endTime-startTime)+"  ms");
    }
}
