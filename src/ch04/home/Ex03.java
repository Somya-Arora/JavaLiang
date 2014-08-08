package ch04.home;

import java.util.Locale;

public class Ex03 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en"));

        final double radius = 6371.01;

        double latitude1 = 10.5;
        double longitude1 = 12.5;
        double latitude2 = 11.5;
        double longitude2 = 13.5;
        double latitude3 = 15.5;
        double longitude3 = 16.5;
        double latitude4 = -11.5;
        double longitude4 = 14.5;

        double x1 = Math.toRadians(latitude1);
        double x2 = Math.toRadians(latitude2);
        double x3 = Math.toRadians(latitude3);
        double x4 = Math.toRadians(latitude4);
        double y1 = Math.toRadians(longitude1);
        double y2 = Math.toRadians(longitude2);
        double y3 = Math.toRadians(longitude3);
        double y4 = Math.toRadians(longitude4);

        double d1 = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        double d2 = radius * Math.acos(Math.sin(x2) * Math.sin(x3) + Math.cos(x2) * Math.cos(x3) * Math.cos(y2 - y3));
        double d3 = radius * Math.acos(Math.sin(x3) * Math.sin(x4) + Math.cos(x3) * Math.cos(x4) * Math.cos(y3 - y4));
        double d4 = radius * Math.acos(Math.sin(x4) * Math.sin(x1) + Math.cos(x4) * Math.cos(x1) * Math.cos(y4 - y1));
        double d5 = radius * Math.acos(Math.sin(x2) * Math.sin(x4) + Math.cos(x2) * Math.cos(x4) * Math.cos(y2 - y4));

        double s1 = (d1 + d5 + d4) / 2;
        double s2 = (d2 + d3 + d5) / 2;

        double area1 = Math.sqrt(s1 * (s1 - d1) * (s1 - d5) * (s1 - d4));
        double area2 = Math.sqrt(s2 * (s2 - d2) * (s2 - d3) * (s2 - d5));

        System.out.println("Estimated area enclosed by these four cities: " + (area1+area2));
    }
}
