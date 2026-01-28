package src;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner  greeting = new Scanner(System.in);

        System.out.println("Enter your name");

        String n = greeting.next();

        System.out.println("hello welcome" + n);


    }
}
