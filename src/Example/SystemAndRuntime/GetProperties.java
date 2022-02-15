package Example.SystemAndRuntime;

import java.util.Properties;
import java.util.Set;

public class GetProperties {
    public static void main(String[] args) {
        //获取当前系统属性
        Properties properties = System.getProperties();
        System.out.println(properties);
        //获取所有系统熟悉的属性名，返回Set对象
        Set<String>propertyNames = properties.stringPropertyNames();
        for(String key : propertyNames){
            String values = System.getProperty(key);
            System.out.println(key+"----->"+values);
        }
    }
}