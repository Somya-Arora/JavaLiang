package ch04.home;

import java.util.Locale;

public class Ex16 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en"));

        char ch = (char) ((int) (65 + Math.random()*26));
        System.out.println(ch);

    }
}
