package src.switchCase;

import java.util.Scanner;

public class Switch_Case_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter browser name Chrome, Edge, Firefox, Opera");

        String browser = sc.next();

        switch (browser.toLowerCase()) // to lower class used cause if user entered a input value in capital or mix,
                // then to convert it to lower case as we have written condition in lowercase (example: Case "chrome" : )
        {
            case "chrome" :
                System.out.println("Execute the Chrome code");
            break;

            case "edge" :
                System.out.println("Execute the Edge code");
            break;

            case "firefox" :
                System.out.println("Execute the Firefox code");
            break;

            case "opera" :
                System.out.println("Execute the Opera code");
            break;

            default:
                System.out.println("I have no idea which browser is this");
        }


    }
}
