package Example.SystemAndRuntime;

import java.lang.management.RuntimeMXBean;

public class GetRuntime {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("处理器："+runtime.availableProcessors());
        System.out.println("闲置内存："+runtime.freeMemory()/1024/1024);
        System.out.println("最大可用内存："+runtime.maxMemory()/1024/1024);
    }
}
