package ch02;

import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double purchaseAmount = in.nextDouble();

        double tax = purchaseAmount * 0.06;
        System.out.println("Sales tax is $" + ((int) (tax * 100)) / 100.0);
    }
}
