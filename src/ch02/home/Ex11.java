package ch02.home;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nas = 312032486;
        int adds = 365 * 24 * 60 * 60 / 7 - 365 * 24 * 60 * 60 / 13 + 365 * 24 * 60 * 60 / 45;

        System.out.print("Enter the numbers of years: ");
        int years = in.nextInt();

        System.out.println("The population in " + years + "years is " + (nas + years * adds));
    }
}
