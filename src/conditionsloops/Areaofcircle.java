package src.conditionsloops;

import java.util.Scanner;

public class Areaofcircle {
    public static void main(String[] args) {
    Scanner tr = new Scanner(System.in);

    System.out.println("Enter the value of r");
    int r = tr.nextInt();

    float area = 3.14f * r * r;
    System.out.println("area of circle is " + area);

    }
}
