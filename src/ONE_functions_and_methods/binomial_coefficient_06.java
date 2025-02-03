package ONE_functions_and_methods;

import java.util.*;

public class binomial_coefficient_06 {
    public static int factorial(int p) {
        int fact = 1;
        for (int i = 1; i <= p; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void binomialCoefficient(int n, int r) {
        int nFact = factorial(n);
        int rFact = factorial(r);
        int nrFact = factorial(n - r);
        int binoCoeff = nFact / (rFact * nrFact);
        System.out.println("Binomial coefficient(nCr) is: " + binoCoeff);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("Enter r:");
        int r = sc.nextInt();
        binomialCoefficient(n, r);
    }
}
