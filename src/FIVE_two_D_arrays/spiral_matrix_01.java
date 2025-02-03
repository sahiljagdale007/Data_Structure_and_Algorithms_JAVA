package FIVE_two_D_arrays;

public class spiral_matrix_01 {
    public static void spiralMatrix(int matrix[][]) {
        int startRow = 0;
        int startColn = 0;
        int endRow = matrix.length - 1;
        int endColn = matrix[0].length - 1;

        while (startRow <= endRow && startColn <= endColn) {

            for (int j = startColn; j <= endColn; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endColn] + " ");
            }

            for (int j = endColn - 1; j >= startColn; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startColn == endColn) {
                    break;
                }
                System.out.print(matrix[i][startColn] + " ");
            }

            startRow++;
            startColn++;
            endRow--;
            endColn--;
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        spiralMatrix(matrix);
    }
}
