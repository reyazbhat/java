package src.BinarySearch;

import src.Switch.s;

public class first {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,66,68,79,87,94,97,876,4589,34756};
        int target = 977;
        int ans = BinarySearch(arr ,target);
        System.out.println(ans);
    }

    static int BinarySearch(int [] arr, int target){
        int st = 0;
        int end = arr.length-1;     
        
        while (st <= end) {
            
            // int mid = (st + end) / 2;

            int mid = st + (end - st) /2;

            if (target < arr[mid]) {
                end = mid -1;
                
            }else if (target>arr[mid]) {
                st=mid+1;
            }else{

                //ans found
                return mid;
            }
        }

        return -1;
    }
}
