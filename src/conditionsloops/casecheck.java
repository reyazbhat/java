package src.conditionsloops;

import java.util.Scanner;

public class casecheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch =  in.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("lower case");
        }
        else{
            System.out.println("Higher Case");
        }

        System.out.println(ch);
    }
}
