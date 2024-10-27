package src.interviewPrograms;

import java.util.Scanner;

public class PalindromeCheckerNumber {
    public static void main(String[] args) {

        // A palindrome is a word or phrase that reads the same backward as forward
        //(ignoring spaces, punctuation, and capitalization).

        // Rough Code
      /*1. First take user input a number
        2. Then initialize an int variable with blank value to add our reversed string
        3. Also initialize an int variable and assign it a user input num
        4. Take a while loop with condition user input number != 0
        5.  remainder = num %10 ;  // here we are storing remainder of num%10
            rev = rev * 10 + remainder;
            num /= 10;   // num = num/10 -> storing quotient
        6. Once loop completed we will be having reverse number of user input
        7. To compare both the value i.e. user input and reversed number we need to use if-else statement
        8. here condition will be originalNum==rev
        9. if its true print it is a palindrome else print not palindrome
      */

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number I will tell if it is Palindrome or not");

        int num = userInput.nextInt(), rev = 0, originalNum = num, remainder;

        while (num != 0){

            remainder = num %10 ;
            rev = rev * 10 + remainder;
            num /= 10;
        }

        if (originalNum==rev){
            System.out.println(originalNum + " is a palidrome number");

        }
        else {
            System.out.println(originalNum + " is not a palidrome number");
        }

    }
}
