package ch02;

import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter three numbers: ");

        double number1 = in.nextDouble();
        double number2 = in.nextDouble();
        double number3 = in.nextDouble();

        double average = (number1 + number2 + number3) / 3;
        System.out.println("The average of " + number1 + " " + number2 + " " + number3 + " is " + average);
    }
}
