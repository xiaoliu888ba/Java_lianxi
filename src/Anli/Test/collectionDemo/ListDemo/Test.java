package Anli.Test.collectionDemo.ListDemo;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();

        ls.add("hello");
        ls.add("world");
        ls.add("java");
        ls.add("python");

        ls.remove(2);

        //foreach循环遍历列表
        for (Object o : ls){
            System.out.println(o);
        }

        System.out.println(ls.get(2));

        System.out.println(ls);

    }
}
