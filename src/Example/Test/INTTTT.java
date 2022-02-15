package Example.Test;

import java.math.BigInteger;

public class INTTTT{
    public static void main(String[] args) {
        Integer x = 127;
        Integer y = 127;
        Integer m = Integer.valueOf(99999);
        Integer n = Integer.valueOf(99999);
        BigInteger a = BigInteger.valueOf(1111111111);
        System.out.println("x == y: " + (x==y)); // true
        System.out.println("m == n: " + (m==n)); // false
        System.out.println("x.equals(y): " + x.equals(y)); // true
        System.out.println("m.equals(n): " + m.equals(n)); // true
        System.out.println(Integer.toString(100,16));//进制转换
    }
}
