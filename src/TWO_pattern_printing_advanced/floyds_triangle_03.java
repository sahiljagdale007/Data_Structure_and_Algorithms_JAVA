package TWO_pattern_printing_advanced;

public class floyds_triangle_03 {
    public static void printPattern(int n, int counter) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5, 1);
    }
}
