package src.arrays;

import java.util.Scanner;

public class Array_07 {
    public static void main(String[] args) {

        //Printing Array using while loop
        int [] marks = new int[4];
        marks[0] = 90;
        marks[1] = 45;
        marks[2] = 65;
        marks[3] = 70;

        int i=0;
        while (i<=marks.length-1){
            System.out.println(marks[i]);
            i++;
        }
        System.out.println("---End of the programm---");

    }
}
