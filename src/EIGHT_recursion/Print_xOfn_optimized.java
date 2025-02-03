package EIGHT_recursion;

public class Print_xOfn_optimized {
    public static int optimizedPower(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = optimizedPower(a, n / 2);
        int halfPowerSq = halfPower * halfPower;
        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String[] args) {
        int a = 2;
        int n = 10;
        System.out.println(optimizedPower(a, n));
    }
}
