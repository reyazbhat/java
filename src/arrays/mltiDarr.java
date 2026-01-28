package src.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class mltiDarr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int [][] arr = new int[5][];
        // int [][] arr2d = {
        //     {1,2,3},
        //     {1,4},
        //     {
        //         1,5,8,9
        //     }
        // };

        // System.out.println(arr2d[1][1]);
        int [][] arr = new int[3][3];
        System.out.println(arr.length);
        
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        // for (int row = 0; row < arr.length; row++) {
        //     for (int col = 0; col < arr[row].length; col++) {
        //         System.out.println(arr[row][col]);
        //     }
        //     System.out.println();
        // }


        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(Arrays.toString(arr[i]));
        // }

        for(int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }
    
}
