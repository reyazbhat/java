package src.linearSearch;

import java.util.Arrays;

public class searchin2d {
    public static void main(String[] args) {
        int [][] arr = {
            {2,54,6},
            {23,55,75,2,9},
            {12,56,85,2,64,74},
            {54,63,29,23}
        };

        // int target = 23;
        // int[] ans = max(arr);
        // System.out.println(Arrays.toString(ans));
        System.err.println(max(arr));
    }

    static int max(int[][] arr){
        int max = arr[0][0];
        for (int[] element : arr) {
            for (int element2 : element) {
                if (element2 > max) {
                    max = element2;
                }
            }
        }

        return max;
    }
}
