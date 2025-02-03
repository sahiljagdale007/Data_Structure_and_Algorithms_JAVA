package ONE_functions_and_methods;

public class decimal_to_binary_11 {
    public static void binTodec(int decimal) {
        int decNum = decimal;
        int rem = 0;
        int binary = 0;
        int pow = 0;
        while (decimal > 0) {
            rem = decimal % 2;
            binary = binary + (rem * (int) Math.pow(10, pow));
            pow++;
            decimal = decimal / 2;
        }
        System.out.println("Binary of " + decNum + "=" + binary);
    }

    public static void main(String[] args) {
        binTodec(10);
    }
}
