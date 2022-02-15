package Example.MathAndRandom;

import java.util.Random;

//Random类在指定的取值范围内求随机数
public class Example_random {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(4));
        System.out.println(r.nextInt());
        System.out.println(r.nextBoolean());
        System.out.println(r.nextDouble());
        System.out.println(r.nextLong());
        System.out.println(r.nextFloat());
    }
}
