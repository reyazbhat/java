package src.conditionsloops;

import java.util.Scanner;

public class AreaofTriangel {
    public static void main(String[] args) {
        Scanner art = new Scanner(System.in);
        
        System.out.println("Enter the base of the triangle");
        float base = art.nextFloat();
        System.out.println("Enter the height of the triangle");
        float height = art.nextFloat();

        float area = (1f/2) * base * height;
        System.out.println("Area  of the triangle is " +area);
    }
}
