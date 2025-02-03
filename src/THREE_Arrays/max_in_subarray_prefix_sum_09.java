package THREE_Arrays;

public class max_in_subarray_prefix_sum_09 {
    public static void PrefixSum(int number[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];

        prefix[0] = number[0];
        for (int i = 1; i < number.length; i++) {
            prefix[i] = prefix[i - 1] + number[i];
        }

        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = 1; j < number.length; j++) {
                int end = j;
                currentSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
            }
            if (maxSum < currentSum) {
                maxSum = currentSum;
            }
        }
        System.out.println("Max sum of subarray is: "+ maxSum);
    }

    public static void main(String[] args) {
        int number[] = {1, -2, 6, -1, 3};
        PrefixSum(number);
    }
}
//Time complexity of this algorithm is O(n square)...