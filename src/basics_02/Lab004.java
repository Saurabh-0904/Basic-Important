package src.basics_02;

import java.util.Scanner;

public class Lab004 {

    public static void main(String[] args) {

        // lets take 3 input to identify max no

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
