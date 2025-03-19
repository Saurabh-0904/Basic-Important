package src.exceptionHandlingWays;

public class ExceptionsPractice {

    public static void main(String[] args) {

        //Simple try-catch block
        try {
            int a = 10/0;
            System.out.println(a);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }




    }
}
