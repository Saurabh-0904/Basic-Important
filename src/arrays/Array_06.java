package src.arrays;

import java.util.Scanner;

public class Array_06 {
    public static void main(String[] args) {

        // Take a input from user marks of 5 subject and print the marks

        Scanner sc = new Scanner(System.in);

        int [] marks = new int[5];
        System.out.println("Enter the first subject marks");
        marks[0] = sc.nextInt();
        System.out.println("Enter the second subject marks");
        marks[1] = sc.nextInt();
        System.out.println("Enter the third subject marks");
        marks[2] = sc.nextInt();
        System.out.println("Enter the fourth subject marks");
        marks[3] = sc.nextInt();
        System.out.println("Enter the fifth subject marks");
        marks[4] = sc.nextInt();

        for (int i=0 ; i<marks.length ; i++){
            System.out.println(marks[i]);

        }

        sc.close();

    }
}
