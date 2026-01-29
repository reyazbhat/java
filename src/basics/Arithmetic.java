package src.basics;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner arithmetic = new Scanner(System.in);

        System.out.println("Enter the fist number");
        int num1 = arithmetic.nextInt();

        System.out.println("Enter the second number");
        int num2 = arithmetic.nextInt();

        System.out.println("Enter the operator");
        char  operator = arithmetic.next().charAt(0);

        if (operator == '*') {
            System.out.println("Result: " +(num1*num2));
        }

        if (operator == '+') {
            System.out.println("Result: " +(num1+num2));
        }
        if (operator == '/') {
            System.out.println("Result: " +(num1%num2));
        }
       if (operator == '-') {
            System.out.println("Result: " +(num1-num2));
        }

        arithmetic.close();
    }
    
}
