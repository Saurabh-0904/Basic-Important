package src.interviewPrograms;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        String name = "Saurabh";

        char [] charArray = name.toCharArray();  // Converted String name to char array
                                                // So char array will be like S a u r a b h

        System.out.println(charArray.length);   // checking array length

        int left = 0;
        int right = charArray.length-1;

        while (left<right){
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right]= temp;

            left++;
            right--;
        }
        String rev_name = new String(charArray);
        System.out.println(rev_name);

    }
}
