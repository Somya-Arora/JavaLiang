package ch03.home;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day: ");

        int today = input.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        int elapsed = input.nextInt();

        int future = (today + elapsed) % 7;

        System.out.print("Today is ");
        if (today==0)
            System.out.print("Monday");
        else
        if (today==1)
            System.out.print("Tuesday");
        else
        if (today==2)
            System.out.print("Wednesday");
        else
        if (today==3)
            System.out.print("Thithday");
        else
        if (today==4)
            System.out.print("Friday");
        else
        if (today==5)
            System.out.print("Saturday");
        else
        if (today==6)
            System.out.print("Sunday");

        System.out.print("  and the future day is ");

        if (future==0)
            System.out.println("Monday");
        else
        if (future==1)
            System.out.println("Tuesday");
        else
        if (future==2)
            System.out.println("Wednesday");
        else
        if (future==3)
            System.out.println("Thithday");
        else
        if (future==4)
            System.out.println("Friday");
        else
        if (future==5)
            System.out.println("Saturday");
        else
        if (future==6)
            System.out.println("Sunday");


    }
}
