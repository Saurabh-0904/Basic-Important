package src.basics_02;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        /*
        Grade Calculator
        WAP that calculate and displays the letter grade for a given
        numerical score (For example A, B, C, D or F) based on the following
        Grading Scale

        A= 90-100
        B= 80-89
        C= 70-79
        D= 60-69
        F= 0-59
        */

        /*
        1. Input from user
        2. Basic logic or brute force logic write basic rough code
        3. Write the real code
        4. Debug the code
        5. Fix the code and final it
         */

        /*
        1. Input from user
        As we are taking a score number from user, and it will be in float so we will take datatype as float
        And for printing a Grade as output we will use char datatype

        2. Basic logic or brute force logic write basic rough code

        if score >= 90 && Score <= 100 print Grade A
        else if score >= 80 && score 89 <= 100 print Grade B


         */

        // 3. Write the real code
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your score");
        int score = sc.nextInt();

        //char grade;
        /*
        if (score >= 90 && score <= 100 )
        {
            grade = 'A';
            System.out.println("Your Score" + grade);
        }
        */

        if (score >= 90 && score <= 100)
        {
            System.out.println("Your Grade is A");
        }
        else if (score >= 80 && score <= 89 )
        {
            System.out.println("Your Grade is B");
        } else if (score >= 70 && score <= 79)
        {
            System.out.println("Your Grade is C");
        } else if (score >= 60 && score >= 69)
        {
            System.out.println("Your Grade is D");
        }
        else
        {
            System.out.println("You are Fail");
        }

        //4. Debug code
        // We are debugging and checking the code
        // other than int --> code fails we will fix
        //Exception --> in future


        //5. Fix the code and final it



    }
}
