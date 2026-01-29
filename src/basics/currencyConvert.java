package src;

import java.util.Scanner;

public class currencyConvert {
    public static void main(String[] args) {
        Scanner convert = new Scanner(System.in);

        System.out.println("Enter INR");
        float inr = convert.nextFloat();

        float usdR = 90;
        float usd = (inr / usdR);

        System.out.println("USD" + usd);
    }
}
