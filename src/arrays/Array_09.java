package src.arrays;

import java.util.Scanner;

public class Array_09 {
    public static void main(String[] args) {

        //Create a program that determines whether a given year is a leap year.

        /*All the leap years since 1900 are as follows:

        1904, 1908, 1912, 1916, 1920, 1924, 1928, 1932, 1936, 1940, 1944,
        1948, 1952, 1956, 1960, 1964, 1968, 1972, 1976, 1980, 1984, 1988,
        1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020*/

        //A leap year is divisible by 4.
        //if the year is divisible of 100 it must also be divisible by 400

        //Use an if-else statement to make this determination

        //Coding ->
        //1. User input
        //2.Rough logic -> (year%4==0) -> leap year ,
                       // ((year%100!=0) -> leap year or (year%400==0) -> leap year)
        //3. Brute force
        //4. Logic correction

        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        if ((year%4==0 && year%100!=0) || (year%400==0)){
            System.out.println(year + " This is a leap year");
        }
        else {
            System.out.println(year + " This is not a leap year");
        }

    }
}
