package src.RCBinary;

public class SortedMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };

        int target = 29;
        int[] ans = search(matrix, target);

        System.out.println(ans[0] + " " + ans[1]);
    }
    static int[] search(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int r = 0;
        int c = cols - 1; // start from top-right

        while (r < rows && c >= 0) {

            if (matrix[r][c] == target) {
                return new int[]{r, c};
            }
            else if (matrix[r][c] > target) {
                c--; // move left
            }
            else {
                r++; // move down
            }
        }

        return new int[]{-1, -1};
    }
}
