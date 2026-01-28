package src.BinarySearch;

public class ceiling {
    public static void main(String[] args) {
        int [] arr = {2,3,5,9,14,16,18};
        int target = 22;
        int ans = ceiling(arr ,target);
        System.out.println(ans);
    }

    // smallest no >= target
    static int ceiling(int [] arr, int target){
        if (target > arr[arr.length-1]) {
            return -1;
        }
        
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

        return st;
    }
}
