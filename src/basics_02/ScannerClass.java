package src.basics_02;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {

        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter any number i will tell no is even or odd");
        int a = sc.nextInt();
        //String S1 = sc.next(); to take string

        if (a%2 == 1)
        {
            System.out.println("No is ODD");
        }
        else
            System.out.println("No is EVEN");



    }
}
