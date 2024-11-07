package src.interviewPrograms;

import java.util.Scanner;

public class TakeUserInputAsArray {

    public static void main(String[] args) {

        // 10,20,30,40,50
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array");
        int n = sc.nextInt();                   // taken user input as array size

        int [] int_array = new int[n];          // created array of user input size

        System.out.println("Enter your elements");

        for (int i=0 ; i<n ; i++){
            int_array[i] = sc.nextInt();         // put user input values to array index
        }

        System.out.println("---Output---");

        for (int i=0; i<n; i++){
            System.out.println(int_array[i]);     // it will print values of array
        }

        sc.close();
        
    }
}
