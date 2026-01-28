package src.functions;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
       Scanner n = new Scanner(System.in);

       System.out.println("Enter one number");
       int a = n.nextInt();
       System.out.println("Enter second");
       int b = n.nextInt();
       evenod(a, b);

    }

    static void evenod(int x, int s){
            if (x%2==0) {
                System.out.println("Even");
            } else{
                System.out.println("odd");
            }
    }
}
