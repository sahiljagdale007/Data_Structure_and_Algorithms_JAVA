package FIVE_two_D_arrays;

public class diagonal_matrix_bruteforce {
    public static int diagonal_matrix(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {                             //this one is for the primary diagonal
                    sum += matrix[i][j];
                } else if (i + j == matrix.length - 1) {  //this one is for secondary diagonal
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        System.out.println(diagonal_matrix(matrix));
    }
}
