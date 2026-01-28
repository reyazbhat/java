package src.functions;

import java.util.Scanner;

import src.Switch.s;

public class max {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.println("Enter first nunber");
        int first = n.nextInt();
        System.out.println("Enter the second number");
        int second = n.nextInt();
        System.out.println("Enter third number");
        int third = n.nextInt();

        max(first, second, third);
        Min(first, second, third);
    }
    static void max(int first, int second, int third){
        if (first > second || first > third) {
            System.out.println("Max is: " +first);
        }
       else if (second > first || second > third) {
            System.out.println("Max is: " +second);
        }
        else{
            System.out.println("max ix: " +third);
        }
    }

    static void Min(int first, int second, int third){
        if (first < second || first < third) {
            System.out.println("Min is: " +first);
        }
       else if (second < first || second < third) {
            System.out.println("min is: " +second);
        }
        else{
            System.out.println("min ix: " +third);
        }
    }
}
