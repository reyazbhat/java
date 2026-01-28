package src.arrays;

import java.lang.reflect.Array;

public class max {
    public static void main(String[] args) {
           int [] arr = { 1,4567, 2, 5, 7 };

           System.out.println(max(arr));
    }
    // work on edgge cases
    static int max(int[] arr){
        int maxv = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxv){
                maxv = arr[i];
            }
        }
        return maxv;
    }
}

//in range
