package src.conditionsloops;

import src.sum;

public class armstrongN {
    public static void main(String[] args) {
     
        int n =1214;

        int temp = n;
        int r, sum =0;

        while (n>0) {
            r = n % 10;
            n = n / 10;
            sum = sum + r*r*r;

            
        }
        if (sum == temp) {
            System.out.println("is ARs");
        } else{
            System.out.println("not Ars");
        }
    }
}
