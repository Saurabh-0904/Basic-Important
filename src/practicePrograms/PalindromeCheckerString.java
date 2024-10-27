package src.practicePrograms;

import java.util.Scanner;

public class PalindromeCheckerString {
    public static void main(String[] args) {

        // A palindrome is a word or phrase that reads the same backward as forward
        //(ignoring spaces, punctuation, and capitalization).

        // Rough Code
      /*1. First take user input
        2. Then init a string variable with blank value to add our reveresed string
        3. convert user input to lowerCase
        4. Take a for loop which starts from higher index to lower index (for e.g if word is having lingth of 5 the 4-0)
        5. make a addition of reversed string with index value of user input and store again in rev
        6. Once loop completed we will be having reverse string of user input
        7. To compare both the value i.e user input and reversed string we need to use if-else statement
        8. here condition will be userinput.equals(rev)
        9. if its true print it is a palindrome else print not palindrome
      */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word I will tell if it is Palindrome or not");

        String word = sc.next(), rev = "";

        word = word.toLowerCase();

        //radar

        for (int i=word.length()-1 ; i>=0 ; i--){
            rev = rev + word.charAt(i);
        }
        if (word.equals(rev)){
          //In above condition we have 1st converted user string to lowercase
          //Then equals method will check the values of index and that is also we converted to lower case
            System.out.println("This String is Palindrome");
        }
        else {
            System.out.println("This String is not a palindrome");
        }


    }
}
