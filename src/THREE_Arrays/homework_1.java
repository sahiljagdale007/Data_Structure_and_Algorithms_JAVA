package THREE_Arrays;

public class homework_1 {
    public static boolean duplEle(int nums[]) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 1};
        System.out.println(duplEle(nums));
    }
}
