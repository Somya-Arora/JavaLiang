package ch02.home;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = in.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double interest = in.nextDouble();
        System.out.print("Enter number of years: ");
        int years = in.nextInt();

        double monthly = investmentAmount*(interest/1200);
        double futureInvestmentValue = investmentAmount * Math.pow((1 + monthly), years * 12);


        System.out.println("Accumulated value is $" + futureInvestmentValue);
    }
}
