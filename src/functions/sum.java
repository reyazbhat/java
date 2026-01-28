package src.functions;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        // sum();
        // sum();
        int ans = sum();
        System.out.println(ans);
    }

    
    static int sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = in.nextInt();
        System.out.println("Enter second number");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        // System.out.println("The sum = " + sum);
        return sum;
    }
//    static void sum(){
//     Scanner in = new Scanner(System.in);
//         System.out.println("Enter first number");
//         int num1 = in.nextInt();
//         System.out.println("Enter second number");
//         int num2 = in.nextInt();
//         int sum = num1 + num2;
//         System.out.println("The sum = " + sum);
//     }
}
