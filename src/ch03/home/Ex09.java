package ch03.home;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int isbn = input.nextInt();

        int d9 = isbn % 10;
        isbn /= 10;
        int d8 = isbn % 10;
        isbn /= 10;
        int d7 = isbn % 10;
        isbn /= 10;
        int d6 = isbn % 10;
        isbn /= 10;
        int d5 = isbn % 10;
        isbn /= 10;
        int d4 = isbn % 10;
        isbn /= 10;
        int d3 = isbn % 10;
        isbn /= 10;
        int d2 = isbn % 10;
        isbn /= 10;
        int d1 = isbn % 10;

        int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

        System.out.print("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9);
        if (d10 > 9) {
            System.out.println("X");
        }
        else
            System.out.println(d10);
    }
}
