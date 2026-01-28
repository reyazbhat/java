package src.linearSearch;

public class findMax {
    public static void main(String[] args) {
        int [] arr = {23,4,86,8,5,4,45,1,-876};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans =arr[i];
            }
        }
        return ans;
    }
}
