package ch02.home;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = in.nextDouble();
        double annualInterest = in.nextDouble();

        double interest = balance * (annualInterest/1200);
        System.out.println("The interest is " + interest);
    }
}
