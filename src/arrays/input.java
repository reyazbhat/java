package src.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class input {   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[8];
        arr[0]= 43;
        arr[1]= 43;
        arr[2]= 43;
        arr[3]= 43;
        arr[4]= 43;
        arr[4]= 43;

        // System.out.println(arr[0]);

        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = in.nextInt();
        // }

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }

        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
