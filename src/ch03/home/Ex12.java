package ch03.home;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");

        int number = input.nextInt();

        int a = number%10;
        int b = number/100;

        if (a == b) {
            System.out.println(number + " is a palindrome");
        }
        else
            System.out.println(number + " is not a palindrome");
    }
}
