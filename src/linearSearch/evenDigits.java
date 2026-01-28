package src.linearSearch;

public class evenDigits {
    public static void main(String[] args) {
        int [] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
        System.out.println(digits(0));
        System.out.println(digits2(456435678));

    }
    static int findNumbers(int[] nums) {
        int countt = 0;
        for(int num : nums ){
            if (even(num)) {
                countt++;
            }
        }
        return countt;
    }

    static boolean even(int num){
        int numberOfDigits = digits(num);
        if (numberOfDigits % 2 ==  0) {
            return true;
        }
        return false;
    }

    static int digits2(int num){
        return (int)(Math.log10(num))+1;
    }
    static int digits(int num){

        if (num <0 ) {
            num = num *-1;
        }
        if (num == 0) {
            return 1;
        }
        int countt = 0;

        while (num>0) {
            countt++;
            num = num /10;
        }
        return countt;
    }
}
