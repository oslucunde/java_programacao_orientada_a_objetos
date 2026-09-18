package application;

import utilities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double amountindollar = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double amountinreais = sc.nextDouble();

        CurrencyConverter cc = new CurrencyConverter(amountindollar, amountinreais, 0.06);

        System.out.printf("Amount to be paid in reais = %.2f", cc.amountinreaiswithTax());

        sc.close();
    }
}
