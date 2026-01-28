package src.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class swap {

    public static void main(String[] args) {
        int [] arr = { 1, 2, 5, 7 };

        // swapp(arr, 0, 3);
        // System.out.println(Arrays.toString(arr));
        // System.out.println();
        reverse(arr);
        // System.out.println(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void reverse(int [] arr){
        int st =0;
        int ed = arr.length-1;

        while (st<ed) {
            swapp(arr, st, ed);
            st++;
            ed--;
        }
    }
    static void swapp(int [] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
