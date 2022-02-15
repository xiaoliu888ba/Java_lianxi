package Example.Test;

class Fib{
    public int Fibonacci(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);
    }
}
public class Solution {
    public static void main(String[] args) {
        Fib f = new Fib();
        System.out.println(f.Fibonacci(6));
    }
}

