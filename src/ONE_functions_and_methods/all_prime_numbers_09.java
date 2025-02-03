package ONE_functions_and_methods;

public class all_prime_numbers_09 {

    public static boolean isprime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void getPrimeNo(int n) {
        for (int i = 2; i <= n; i++) {
            if (isprime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        getPrimeNo(100);
    }
}
