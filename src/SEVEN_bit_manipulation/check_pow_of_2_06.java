package SEVEN_bit_manipulation;

public class check_pow_of_2_06 {
    public static int checkPower(int n) {
        return n & n-1;
    }
    public static void main(String[]args) {
        System.out.println(checkPower(16));
    }
}
