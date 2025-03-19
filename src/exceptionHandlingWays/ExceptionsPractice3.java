package src.exceptionHandlingWays;

public class ExceptionsPractice3 {

    public static void main(String[] args) {

        //try - catch - finally block
        int a;
        int [] b = {1,2,3,4,5};
        try {
            a = 10/2;
            System.out.println(b[10]);
            System.out.println(a);
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e){ // After Java 7 we can write multiple exceptions in a single catch by using '|' i.e. (OR)
            //System.out.println(e.getMessage());
            e.printStackTrace();
        }
        finally {
            //close all the open resources!!
            System.out.println("Calling Finally Block");
        }





    }
}
