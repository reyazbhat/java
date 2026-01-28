package src;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        float num3 = input.nextFloat();

        float sum = num1 + num3;

        System.out.println("Sum = " + sum);

    }
}
