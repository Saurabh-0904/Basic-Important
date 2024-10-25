package src.interviewPrograms;

import java.util.Scanner;

public class MathematicsProblem_1 {

    /*
    Take input from user for x, y, z
    take in double
    and print the result for

    // 3 root (x^2 + y^2 - |z|)

    3 root nothing but cube root of whole bracket (or bracket^1/3)

     */

    /*
    1. First compute the respective powers of two floating point variables x and y
    2. Then add them after taking a powers.
    3. Then, compute the absolute value of floating -point z.
    4. Subtract this from above-computed addition value.
    5. Now take cube root of the answer
    6. Use inbuilt functions to calculate this expression.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x");
        double x = sc.nextDouble();
        System.out.println("Enter the value of y");
        double y = sc.nextDouble();
        System.out.println("Enter the value of z");
        double z = sc.nextDouble();
        double result ;

        x = Math.pow(x,2);
        y = Math.pow(y,2);
        result = x + y ;
        z = Math.abs(z);
        result = result - z;
        result = Math.cbrt(result);
        System.out.println("Result =" + result);

//        System.out.println(Math.cbrt((x*x + y*y - Math.abs(z))));  // we can get ans by this single line also


        sc.close();  // Scanner stream should be closed after we are done.
                    // If we don't do JVM will do it, Garbage Collector -> who will do it for you
                   //But it is not a good practice if we don't add
                  // so add it in the last line (Good Practice)

    }


}
