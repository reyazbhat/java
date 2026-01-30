package src.Sorting;

import java.util.Arrays;

public class selectionSort {

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7, 1, 9};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            // find max in remaining array
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);

            // swap max with last
            swap(arr, maxIndex, last);
        }
    }

    static int getMaxIndex(int[] arr, int start, int last) {

        int max = start;

        for (int i = start; i <= last; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }

        return max;
    }

    static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
