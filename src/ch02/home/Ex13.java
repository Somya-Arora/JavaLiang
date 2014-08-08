package ch02.home;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");

        double amount = in.nextDouble();
        double multy = 1 + 0.00417;

        double result = 0;
        result = (result+amount)*multy;
        result = (result+amount)*multy;
        result = (result+amount)*multy;
        result = (result+amount)*multy;
        result = (result+amount)*multy;
        result = (result+amount)*multy;

        result = ((int)(result*100))/100.0;

        System.out.println("After the sixth month, the account value is $" + result);
    }
}
