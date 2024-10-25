package src.basics_01;

import java.util.Scanner;

public class Lab004 {

    public static void main(String[] args) {

        //Take the user input and print the information

        Scanner user_input = new Scanner(System.in);

        System.out.println("Enter your Name");
        String name = user_input.next();

        System.out.println("Enter your Age");
        int age = user_input.nextInt();

        System.out.println("Enter your Salary");
        double salary = user_input.nextDouble();

        System.out.println("Your details are");
        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your salary is " + salary);

        user_input.close();
    }
}
