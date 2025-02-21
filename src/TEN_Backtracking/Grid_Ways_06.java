package TEN_Backtracking;

public class Grid_Ways_06 {
    public static int gridWays(int i, int j, int n, int m) {
        if (i == n - 1 && j == m - 1) {
            return 1;
        } else if (i == n || j == n) {
            return 0;
        }

        int w1 = gridWays(i + 1, j, n, m);
        int w2 = gridWays(i, j + 1, n, m);
        int totalWays = w1 + w2;
        return totalWays;
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        System.out.println(gridWays(0, 0, n, m));
    }
}
