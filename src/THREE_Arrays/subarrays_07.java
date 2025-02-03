package THREE_Arrays;

public class subarrays_07 {
    public static void subArray(int number[]) {
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(number[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    // SUM OF SUBARRAY
    public static void sumOfsubarray(int number[]) {
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    System.out.print(number[k] + " ");
                    sum = sum + number[k];
                }
                System.out.println("=> Sum: " + sum);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10};
        subArray(number);
        sumOfsubarray(number);
    }
}
