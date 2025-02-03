package ONE_functions_and_methods;

import java.util.*;

public class product_of_a_and_b_04 {
    public static int product() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        System.out.println("Multiplication of two numbers is: " + product());
    }
}
