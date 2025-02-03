package ONE_functions_and_methods;
import java.util.*;

public class swap_two_numbers_03 {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b=temp;
        System.out.println("swapped a is:"+a);
        System.out.println("swapped b is:"+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you want to swap: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        swap(a,b);
    }
}
