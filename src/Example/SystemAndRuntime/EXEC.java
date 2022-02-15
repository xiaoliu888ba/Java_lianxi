package Example.SystemAndRuntime;

import java.io.IOException;
//Runtime类的exec()方法 和Process对象的destory()对象
public class EXEC {
    public static void main(String[] args) throws Exception {
        Runtime rt = Runtime.getRuntime();
        Process process = rt.exec("notepad.exe");
        //程序休眠2秒
        Thread.sleep(2000);
        //关闭程序
        process.destroy();
    }
}
