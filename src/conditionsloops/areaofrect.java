package src.conditionsloops;

import java.util.Scanner;

public class areaofrect {
    public static void main(String[] args) {
        Scanner art = new Scanner(System.in);
        
        System.out.println("Enter the length");
        float l = art.nextFloat();

        System.out.println("Enter the width");
        float w = art.nextFloat();

        float area = l * w;

        System.out.println("Area is " + area);
    } 
      
}
