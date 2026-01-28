package src.linearSearch;

public class first {
    public static void main(String[] args) {
        int[] nums = {32,34,54,65,19};
        int target=19;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target){
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return element;
            }
        }
        return -1;
    }
}
