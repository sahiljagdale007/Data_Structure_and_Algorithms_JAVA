package ONE_functions_and_methods;

public class binary_to_decimal_10 {

    public static void binToDec(int biNum) {
        int myNum = biNum;
        int pow = 0;  //power ji ek ne vadhat janar
        int decNum = 0;  //answer store honar
        while (biNum > 0) {
            int lastDigit = biNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            biNum = biNum / 10;
        }
        System.out.println("Binary of " + myNum + " = " + decNum);
    }

    public static void main(String[] args) {
        binToDec(10);
    }
}
