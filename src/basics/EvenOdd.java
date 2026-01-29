package src;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number");

        int number = num.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
    }
    
}
