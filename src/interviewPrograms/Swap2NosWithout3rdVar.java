package src.interviewPrograms;

import java.util.Scanner;

public class Swap2NosWithout3rdVar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no");
        int a = sc.nextInt();
        System.out.println("Enter Second no");
        int b = sc.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("Your swapped nos are "+ "a= "+ a + " b= "+ b);

    }
}