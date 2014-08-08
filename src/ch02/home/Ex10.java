package ch02.home;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms: ");
        double m = in.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double t1 = in.nextDouble();
        System.out.print("Enter rhe final temperature: ");
        double t2 = in.nextDouble();

        System.out.println("The energy needed is " + (m * (t2 - t1) * 4184));
    }
}
