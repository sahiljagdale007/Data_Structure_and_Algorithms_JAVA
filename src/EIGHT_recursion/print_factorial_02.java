package EIGHT_recursion;

public class print_factorial_02 {
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = fact(n - 1);
        int fn = n * fnm1;
        return fn;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
    }
}
