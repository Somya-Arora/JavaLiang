package ch02.home;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double pounds = in.nextDouble();

        System.out.print("Enter height in inches: ");
        double inches = in.nextDouble();

        double kilo = pounds * 0.45359237;
        double meters = inches * 0.0254;

        double bmi = kilo / (meters * meters);
        System.out.println("BMI is " + bmi);
    }
}
