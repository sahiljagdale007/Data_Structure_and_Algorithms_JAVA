package FIVE_two_D_arrays;

public class search_in_sorted_matrix {
    public static boolean stairCase(int matrix[][], int key) {
        int row = 0, col = matrix.length - 1;
        while (row < matrix.length && col >= 0) {
            if (key == matrix[row][col]) {
                System.out.println("key found at(" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("Key is not found");
        return false;
    }

    public static void main(String[] args) {
        int matirx[][] = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};
        int key = 32;
        stairCase(matirx, key);
    }
}
