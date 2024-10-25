package src.interviewPrograms;

import java.util.Scanner;

public class FactorialNo_01 {
    public static void main(String[] args) {

        //Print a factorial of number using while loop

        //Factorial ?
        // 1! =1
        // 2! = 2*1 = 2
        // 3! = 3*2*1 = 6
        // 4! = 4*3*2*1 = 24
        // 5! = 5*4*3*2*1 = 120


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = scanner.nextInt();

        long fact = 1;
        //A -> int i=1       //Initialisation
        //B -> i <= number   // Condition
        //C -> i++           // Increment
        //D -> fact = fact*i // Code

        int i = 1;
        while (i<=num){
            fact = fact * i ;
            i++;
        }
        System.out.println("Factorial of "+ num + " is "+ fact);

        scanner.close();

    }
}
