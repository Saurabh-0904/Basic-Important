package src.interviewPrograms;

import java.util.Scanner;

public class MaxNO {

    public static void main(String[] args) {

        // let's take 2 input to identify max no

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two nos");

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a>b)
        {
            System.out.println("Max no is " + a);
        }
        else {
            System.out.println("Max no is " + b);
        }
    }
}
