package THREE_Arrays;

public class max_in_subarray_08 {
    public static void sumOfSubarray(int number[]) {
        int currentSum;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                currentSum = 0;
                for (int k = start; k <= end; k++) {
                    currentSum += number[k];
                }
                System.out.println(currentSum);
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("Max sum of subarry is: " + maxSum);
    }

    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};
        sumOfSubarray(number);
    }
}
//the time complexity of this algorithm is very bad!!