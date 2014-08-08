package ch02.home;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");

        double cels = in.nextDouble();
        double fahr = (9 / 5.0) * cels + 32;

        System.out.println(cels + " Celsius is " + fahr + " Fahrenheit");
    }
}
