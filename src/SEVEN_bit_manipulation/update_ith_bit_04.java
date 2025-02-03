package SEVEN_bit_manipulation;

public class update_ith_bit_04 {
    public static int updateIthBit(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(updateIthBit(15,2));
    }
}
