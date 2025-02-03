package EIGHT_recursion;

public class Fibonacci_number_03 {
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        int Fibonacci = fnm1 + fnm2;
        return Fibonacci;
    }

    public static void main(String[] args) {
        int n = 27;
        System.out.println(fib(n));
    }
}
