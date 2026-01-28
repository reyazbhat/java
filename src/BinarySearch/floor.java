package src.BinarySearch;

public class floor {
    public static void main(String[] args) {
        int [] arr = {2,3,5,9,14,16,18};
        int target = 1;
        int ans = floor(arr ,target);
        System.out.println(ans);
    }

    // biggest no <= target
    static int floor(int [] arr, int target){

        
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
