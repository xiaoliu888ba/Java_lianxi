package Example.SystemAndRuntime;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] l1 = {111,222,333,444,555,666};
        int[] l2 = {777,88,999,000};
        System.arraycopy(l1,2,l2,0,2);
        for ( int i =0 ;i<l2.length;i++){
            System.out.println(i +':'+l2[i]);
        }
        System.out.println(Arrays.toString(l2));
    }
}

