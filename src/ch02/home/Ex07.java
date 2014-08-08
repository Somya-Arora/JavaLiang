package ch02.home;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the nu,ber of minutes: ");
        long minutes = in.nextLong();

        long years = ((minutes/60)/24)/365;
        long days = ((minutes/60)/24)%365;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}
