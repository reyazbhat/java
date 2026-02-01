package src;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int [] arr = {1,1,7,7,8,8,9,9,0,0,7};
        RemoveDuplicate(arr);
        System.out.println(Arrays.toString(arr));
    }

   static int RemoveDuplicate(int [] arr){
         if (arr.length == 0) {
            return 0;
        }

        int k = 1; // index for next unique element

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[k] = arr[i];
                k++;
            }
        }

        return k;
    }
}
