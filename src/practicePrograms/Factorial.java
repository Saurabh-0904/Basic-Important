package src.practicePrograms;

public class Factorial {

    public static void main(String[] args) {

        int num = 5;
        int fact = 1;

        for (int i=num; i>1; i--){
            fact = fact*i; //5 20 60 120
        }

        System.out.println("Factorial of " + num + " is :" + fact);

    }


}

