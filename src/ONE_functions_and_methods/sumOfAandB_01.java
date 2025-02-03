package ONE_functions_and_methods;

import java.util.*;

public class sumOfAandB_01 {
    public static int sumofAandB(int num1, int num2) {  //parameters and formal parameters
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        int addition = sumofAandB(a, b);       //arguments and actual parameters
        System.out.println("Sum of both the number is: " + addition);
    }
}
