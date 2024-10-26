package src.interviewPrograms;

public class FizzBuzzProblem {
    public static void main(String[] args) {

        //Fizzbuzz problem :
        // WAP that prints nos from 1 to 100
        //For multiples of 3 , print "Fizz" instead of number,
        //and for multiples of 5, print "Buzz".
        // for numbers which multiples of both 3 and 5 print "fizzbuzz".

        //Coding ->
        //1. User input
        //2.Rough logic -> for loop 1-100, i%3 == 0 -> Fizz , i%5 == 0 -> Buzz, i%3 && i%5 == 0 -> FizzBUzz
        //3. Brute force
        //4. Logic correction

        // in this case there are 3 condition 3, 5, and for both
        //So first take both condition (Whenever we see 2 values in condition then take first)
        // then 3 (divisible by 3)
        // then 5 (divisible by 5)

        for(int i=1 ; i<=100 ; i++){

            if (i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
                }
            else if (i%3==0) {
                System.out.println("Fizz");
            } else if (i%5==0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }

        }
        System.out.println("---EOP---");



    }
}
