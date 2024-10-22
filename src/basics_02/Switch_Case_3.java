package src.basics_02;

import java.util.Scanner;

public class Switch_Case_3 {
    public static void main(String[] args) {

        /*
        WAP to print a vowel
        a, e , i, o, u

         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character I will tell if it is a vowel or not");

        char vowel = sc.next().toCharArray()[0]; // toCharArray() used cause sc.next() storing String
                // and we have used a char datatype, so using this array and by passing value 0
                // it will only first character of the String.
                // for e.g if we give input as umbrella it will take first 'u' as a input
        System.out.println(vowel);

        switch (vowel) {
            case 'a':
                System.out.println("This is a Vowel");
                break;

            case 'e':
                System.out.println("This is a Vowel");
                break;

            case 'i':
                System.out.println("This is a Vowel");
                break;

            case 'o':
                System.out.println("This is a Vowel");
                break;

            case 'u':
                System.out.println("This is a Vowel");
                break;

            default:
                System.out.println("Not a Vowel, It is Consonant");
        }

    }
}
