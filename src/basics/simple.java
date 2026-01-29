package src;

import java.util.Scanner;

public class simple {
    public static void main(String[] args) {
        Scanner intrest = new Scanner(System.in);

        System.out.println("Enter Principal Amount");
         int Pi = intrest.nextInt();

        System.out.println("Time in Years");
         int t = intrest.nextInt();

        System.out.println("Enter Annual Intrest Rate");
        int a = intrest.nextInt();

        int finalAmount = ( Pi *1 + a*t);

        System.out.println("Your Final Amount is:" + finalAmount);
    }
}
