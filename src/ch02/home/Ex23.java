package ch02.home;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the driving distance: ");
        double s = in.nextDouble();

        System.out.print("Enter miles per gallon: ");
        double mPg = in.nextDouble();

        System.out.print("Enter price per gallon: ");
        double price = in.nextDouble();

        System.out.println("The cost of driving is $" + ((int) (s / mPg * price * 100)) / 100.0);
    }
}
