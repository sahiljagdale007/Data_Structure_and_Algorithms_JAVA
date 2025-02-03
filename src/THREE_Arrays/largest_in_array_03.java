package THREE_Arrays;

public class largest_in_array_03 {
    public static int largetstNumber(int number[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]) {
                largest = number[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int number[] = {1, 2, 6, 3, 5};
        System.out.println("Largest number in the given array is: " + largetstNumber(number));


    }
}
