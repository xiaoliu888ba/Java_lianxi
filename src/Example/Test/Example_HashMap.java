package Example.Test;

import java.util.HashMap;

public class Example_HashMap {
    public static void main(String[] args) {
        HashMap<String,String> m1 = new HashMap();
        HashMap<String,String> m2 = new HashMap(){};
        HashMap<String,String> m3 = new HashMap(){
            {
                put("A","1");
                put("B","2");
            }
        };
        System.out.println(m3.get("B"));
    }
}
