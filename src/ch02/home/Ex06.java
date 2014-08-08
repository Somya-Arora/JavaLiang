package ch02.home;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int number = in.nextInt();

        int sum = 0;

        int ost = number % 10;
        sum += ost;
        number /= 10;

        ost = number % 10;
        sum += ost;
        number /= 10;

        ost = number % 10;
        sum += ost;

        System.out.println("The sum of the digits is " + sum);
    }
}
