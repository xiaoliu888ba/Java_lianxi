package Anli.Test.collectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        Collection<String>  c = new ArrayList<>();
        c.add("hello");
        c.add("world");
        c.add("java");
        c.add("C");
        c.add("python");
        c.add("c#");

        //remove(Object O)删除指定元素
        c.remove("C");

        //addAll(Collection<? extends E> c) 将指定集合中的所有元素添加到此集合（可选操作）。
        //contains(Object o) 如果此集合包含指定的元素，则返回 true 。
        System.out.println(c.contains("java"));

        //isEmpty()判断集合中是否有元素
        System.out.println(c.isEmpty());

        //clear()删除集合中的所有元素
        //c.clear()

        //size()返回集合中的元素个数

        //遍历集合使用iterator()方法
        Iterator<String> ss = c.iterator();
        while (ss.hasNext()){
            String s = ss.next();
            System.out.println(s);
        }
    }
}
