package THREE_Arrays;

public class reverse_array_05 {
    public static void reverseArray(int number[]) {
        int first = 0;
        int last = number.length - 1;
        while (first < last) {
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10};
        reverseArray(number);
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
    }
}
