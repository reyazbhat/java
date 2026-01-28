package src.BinarySearch;

public class OderAgnosticBS{

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,66,68,79,87,94,97,876,4589,34756};
        int target = 97;

        System.out.println(orderAgnosticBS(arr, target));
    }

    static int orderAgnosticBS(int[] arr, int target) {

        int st = 0;
        int end = arr.length - 1;

        boolean isAscending = arr[st] < arr[end];

        while (st <= end) {

            int mid = st + (end - st) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            }
        }
        return -1;
    }
}
