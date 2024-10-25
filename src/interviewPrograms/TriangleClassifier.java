package src.interviewPrograms;

import java.util.Scanner;

public class TriangleClassifier {

    public static void main(String[] args) {

        /*
        Triangle Classifier

        WAP that classifies a triangle based on its side lengths.

        Given three input values representing the lengths of sides,
        determine if triangle is equilateral (All Sides are equal)

        Isosceles (exactly 2 sides are equal)

        scalene (no sides are equal)

        Use an if-else statement to classify the triangle.

         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the side1, side2 and side3, I will tell about the triangle");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        if ((side1 == side2) && (side2 == side3) && (side1 == side3))
        {
            System.out.println("This is a equilateral");
        } else if ((side1==side2)||(side2==side3)||(side1==side3)) {
            System.out.println("This is a Isosceles");
        }
        else {
            System.out.println("This is a scalene");
        }


    }
}
