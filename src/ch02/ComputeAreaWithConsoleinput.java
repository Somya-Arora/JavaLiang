package ch02;

import java.util.Scanner;

public class ComputeAreaWithConsoleinput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();

        double area = 3.14159*radius*radius;

        System.out.println("The area for the circle radius " + radius + " is " + area);
    }
}
