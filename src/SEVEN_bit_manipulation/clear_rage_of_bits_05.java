package SEVEN_bit_manipulation;

public class clear_rage_of_bits_05 {
    public static int clearRangeBits(int n,int i,int j) {
        int a = (~0) << (j+1);
        int b = (1<<i)-1;
        int bitMask =  a | b;
        return n & bitMask;
    }
    public static void main(String[]args) {
        System.out.println(clearRangeBits(10,2,4));
    }
}
