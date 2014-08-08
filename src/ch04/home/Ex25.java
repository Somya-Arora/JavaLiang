package ch04.home;

import java.util.Locale;

public class Ex25 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en"));

        String s;

        char ch1 = (char) ((int) (65 + Math.random() * 26));
        char ch2 = (char) ((int) (65 + Math.random() * 26));
        char ch3 = (char) ((int) (65 + Math.random() * 26));

        int digit1 = (int) (Math.random() * 10);
        int digit2 = (int) (Math.random() * 10);
        int digit3 = (int) (Math.random() * 10);
        int digit4 = (int) (Math.random() * 10);


        s = ch1 + "" + ch2 + "" + ch3 + "" + digit1 + "" + digit2 + "" + digit3 + "" + digit4;

        System.out.println("Number is " + s);
    }
}
