package src.basics_02;

import java.util.Scanner;

public class Switch_Case_1 {

    public static void main(String[] args) {
        /*
    Switch condition
    WAP which day is today

     */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no, between 1-7 I will tell a Day");
        int dayNumber = sc.nextInt();

        //1 -> Monday, 7-> Sunday, (Mon, Tue, Wed, Thu, Fri, Sat, Sun) For invalid (example 99) -> Enter a valid number

        //String day = null;

        switch (dayNumber)
        {
            case 1:
                System.out.println("Monday");
            break;

            case 2:
                System.out.println("Tuesday");
            break;

            case 3:
                System.out.println("Wednesday");
            break;

            case 4:
                System.out.println("Thursday");
            break;

            case 5:
                System.out.println("Friday");
            break;

            case 6:
                System.out.println("Saturday");
            break;

            case 7:
                System.out.println("Sunday");
            break;

            default:
                System.out.println("Enter a valid number");
        }

        System.out.println("Have a nice day, Bye");



    }



}
