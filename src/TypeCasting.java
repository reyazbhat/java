package src;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            //  float num = input.nextFloat();
            // System.out.println(num);

            // Type Casting
            // int num = (int) 67.5234f;
            // System.out.print(num);

            // automatic type pomotion in expressions

            // int a = 245;
            // byte b = (byte)(a);  //257 % 256 =1

            // byte a = 40;
            // byte b = 50;
            // byte c = 100;
            // int d = (a * b) / c;

            // System.out.println(d);

            // byte b = 50;
            // b = b * 2;

            // int number = 'A';

            // System.out.print(number);

            // System.out.print( 3 * 5);

            byte b = 35;
            char c = 'q';
            short s = 5423;
            int i = 7000;
            float f = 5.5434f;
            double d = 0.52463;
            double result = (f * b) + (i / c) - (d * s); 
            System.out.println((f * b) +  " " + (i / c) + " " + (d - s));

            System.out.println(result);

    }
}
