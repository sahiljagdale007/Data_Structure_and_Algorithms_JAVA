package SEVEN_bit_manipulation;

public class clear_ith_bit_03 {
    public static int clearBit(int n, int i) {
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static void main(String[]args) {
        System.out.println(clearBit(10, 1));
    }
}
