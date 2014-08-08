package ch03.home;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month: ");
        int month = input.nextInt();

        System.out.print("Enter the year: ");
        int year = input.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int day = 0;

        switch (month) {
            case 1:
                day = 31;
                System.out.print("Jan " + year + " has " + day + " days");
                break;
            case 2:
                if (isLeapYear)
                    day = 29;
                else
                    day = 28;

                System.out.print("Feb " + year + " has " + day + " days");
                break;
            case 3:
                day = 31;
                System.out.print("Mar " + year + " has " + day + " days");
                break;
            case 4:
                day = 30;
                System.out.print("Apr " + year + " has " + day + " days");
                break;
            case 5:
                day = 31;
                System.out.print("May " + year + " has " + day + " days");
                break;
            case 6:
                day = 30;
                System.out.print("Jun " + year + " has " + day + " days");
                break;
            case 7:
                day = 31;
                System.out.print("Jul " + year + " has " + day + " days");
                break;
            case 8:
                day = 31;
                System.out.print("Aug " + year + " has " + day + " days");
                break;
            case 9:
                day = 30;
                System.out.print("Sep " + year + " has " + day + " days");
                break;
            case 10:
                day = 31;
                System.out.print("Oct " + year + " has " + day + " days");
                break;
            case 11:
                day = 30;
                System.out.print("Nov " + year + " has " + day + " days");
                break;
            case 12:
                day = 31;
                System.out.print("Dec " + year + " has " + day + " days");
                break;
        }

    }
}
