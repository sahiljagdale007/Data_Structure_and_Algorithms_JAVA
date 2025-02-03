package THREE_Arrays;

public class kadanes_algorithm_10 {
    public static void kadanes(int number[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            cs = cs + number[i];

            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Max sum of subarray: " + ms);
    }

    public static void main(String[] args) {
        int number[] = {1,-2,6,-1,-3};
        kadanes(number);
    }
}
