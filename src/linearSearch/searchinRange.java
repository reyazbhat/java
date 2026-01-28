package src.linearSearch;

public class searchinRange {
    public static void main(String[] args) {
        int[] nums = {32,34,54,65,19};
        int target=34;
        int st = 1;
        int end = 3;
        int ans = linearSearch(nums, target, st, end);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target, int st, int end){
        if (arr.length == 0) {
            return -1;
        }

        for (int i = st; i <= end; i++) {
            int element = arr[i];
            if (element == target) {
                return element;
            }
        }
        return -1;
    }
}


