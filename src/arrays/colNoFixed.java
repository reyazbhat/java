package src.arrays;

public class colNoFixed {
    public static void main(String[] args) {
        int [][] arr = {
            {1,3,6,7},
            {2,6},
            {4,8,9}
        };

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.println(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
