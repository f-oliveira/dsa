package algorithms.dynamicprogrammings;

public class Fibonacci {

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1);
    }
    public static void main(String[] args) {
        fib(5);
    }
}
