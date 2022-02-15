package Example.Test;

import java.util.Arrays;
import java.util.Locale;

public class Example_String {
    public static void main(String[] args) {
    //字符串的比较  equals()方法
        String a = "hello";
        String c = "Hello";
        System.out.println(a.equals(c));

    //忽略大小写比较
        System.out.println(a.equalsIgnoreCase(c));

        //搜索子串
        System.out.println("Hello".contains("ll"));
        System.out.println("Hello".indexOf('l'));
        System.out.println("Hello".lastIndexOf('l'));
        System.out.println("Hello".startsWith("He"));
        System.out.println("Hello".endsWith("o"));


        //提取子串  索引是从0开始的，不包含最后一个
        System.out.println("Hello".substring(2));
        System.out.println("Hello".substring(2,4));

        //去除首尾空白字符  trim()返回的是一个新的字符串
        System.out.println("\thello\r\n".trim());
        // strip()   stripLaeding()   stripTrailing()

        //是否为空和空白字符
        System.out.println("".isEmpty());
        System.out.println(" ".isEmpty());

        //替换字符串
        System.out.println(a.replace('l','a'));
        System.out.println(a.replace("ll","~~"));
        //正则表达式替换
        String s = "A,B,C,D";
//        System.out.println(s.replace("[\\,\\;\\s]+",","));

        //分割字符串
        String [] ss = s.split("\\,");
        System.out.println(Arrays.toString(ss));

        //拼接字符串
        String[] arr = {"A,B,C,D"};
        String bb = String.join("$$$",arr);
        System.out.println(arr);

        //格式化字符串format()和formatted()
        System.out.println(String.format("Hi %s, your score is %.2f!", "Bob", 59.5));

        //类型专换valueof()转换成字符串
        System.out.println(String.valueOf(12));
        //转换成boolean类型
        boolean b = Boolean.parseBoolean("true");

        //转换为char[]  toCharArray()  如果char[]数组修改，String不做改变
        char[] sc = "hello".toCharArray();//String -> char[]
        String l = new String(sc); //char[] ->String
        System.out.println(sc);
        System.out.println(l);



    }
}