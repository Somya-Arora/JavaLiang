package ch03.home;


public class Ex04 {
    public static void main(String[] args) {

        int month = (int) (Math.random() * 12 + 1);

        System.out.print(month + " - ");
        if (month == 1)
            System.out.println("Jan");
        if (month == 2)
            System.out.println("Feb");
        if (month == 3)
            System.out.println("Mar");
        if (month == 4)
            System.out.println("Apr");
        if (month == 5)
            System.out.println("May");
        if (month == 6)
            System.out.println("Jun");
        if (month == 7)
            System.out.println("Jul");
        if (month == 8)
            System.out.println("Aug");
        if (month == 9)
            System.out.println("Sep");
        if (month == 10)
            System.out.println("Oct");
        if (month == 11)
            System.out.println("Nov");
        if (month == 12)
            System.out.println("Dec");

    }
}
