package ch02.home;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double temp = in.nextDouble();

        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double speed = in.nextDouble();

        double realTemp = 35.74 + 0.6215 * temp - 35.75 * Math.pow(speed, 0.16) + 0.4275 * temp * Math.pow(speed, 0.16);
        System.out.println("The wind chill index is " + realTemp);
    }
}
