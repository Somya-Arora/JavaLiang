package ch03.home;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: (e.g., 2012): ");
        int year = input.nextInt();

        System.out.print("Enter month: 1-12: ");
        int month = input.nextInt();

        if (month == 1)
            month = 13;

        if (month == 2)
            month = 14;

        System.out.print("Enter the day of the month: 1-31: ");
        int day = input.nextInt();

        double h = (day + (26 * (month + 1)) / 10 + (year % 100) + ((year % 100) / 4) + (year / 100) / 4 + 5 * (year / 100)) % 7;

        System.out.print("Day of the week is ");

        switch ((int)h) {
            case 0:
                System.out.println("Saturday");
                break;
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
        }
    }
}
