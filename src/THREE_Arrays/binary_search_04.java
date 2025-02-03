package THREE_Arrays;

public class binary_search_04 {
    public static int binarySearch(int number[], int key) {
        int start = 0;
        int end = number.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] < key) {
                //check into the right array
                start = mid + 1;
            }
            if (number[mid] > key) {
                //check into the left array
                end = end - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int key = 10;
        System.out.println("Index of given key is: " + binarySearch(number, key));
    }
}
