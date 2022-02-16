package Anli.Test.Sort;

import java.util.Arrays;

public class StringSort {

    public static void main(String[] args) {
        String s = "21 43 213 543 34";
        System.out.println("排序前："+s.toString());
        System.out.println("类型："+s.getClass().toString());
        String[] str = s.split(" ");//根据空格把原字符串分割成字符数组
        //转成int型数组
        int[] a = new int[str.length];
        for (int i=0; i< str.length;i++){
            //System.out.println(str[i]);
            a[i]=Integer.parseInt(str[i]);
        }

        Arrays.sort(a);

        //按照指定格式输出
        StringBuilder ss = new StringBuilder();
        for (int i=0; i< str.length;i++){
            if (i == a.length-1){
                ss.append(a[i]);
                break;
            }else {
            ss.append(a[i]).append(" ");
        }}
        System.out.println("排序后："+ss.toString());
        System.out.println("类型："+ss.getClass().getName());//查看数据类型
    }
}
