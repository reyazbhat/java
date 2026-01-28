package src.Switch;

import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class nestedswitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String department = in.next();

        switch (department) {
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("jkhsdgf");
                break;
            case 3:
                System.out.println("Enter empolyee number 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT dept");
                    case "management":
                    System.out.println("management dept");                        
                        break;
                
                    default:
                        System.out.println("no dept");
                }
                break;
            default:
                System.out.println("Enter correct dept");
        }
    }
}
