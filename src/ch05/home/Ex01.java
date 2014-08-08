package ch05.home;

import java.util.Scanner;
import java.util.Locale;

public class Ex01 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en"));
        Scanner input = new Scanner(System.in);

        int countP = 0;
        int countM = 0;
        int sum = 0;
        double aver = 0;

        System.out.print("Enter an integer, the input ends if it is 0: ");

        int in = -1;

        while (in != 0)  {

            in = input.nextInt();

            if (in > 0) {
                countP++;
            }
            else if (in < 0) {
                countM++;
            }

            sum += in;
            aver = sum / (double)(countM + countP);

        }

        if (countM + countP == 0) {
            System.out.println("No numbers are entered except 0");
        }
        else {
            System.out.println("The number of positives is " + countP);
            System.out.println("The number of negatives is " + countM);
            System.out.println("The total is " + sum);
            System.out.println("The average is " + aver);
        }

    }
}
