package src;

import java.util.Scanner;

public class largestNum {
    public static void main(String[] args) {
        Scanner largestNumber =  new Scanner(System.in);

        System.out.println("Enter first number");
        int firstNum = largestNumber.nextInt();

        System.out.println("Enter second number");
        int secondNum = largestNumber.nextInt();

        if (firstNum > secondNum) {
            System.out.println( "largest number is: " + firstNum);
        }

        else{
            System.out.println("largest number is: " + secondNum);
        }

    }
}
