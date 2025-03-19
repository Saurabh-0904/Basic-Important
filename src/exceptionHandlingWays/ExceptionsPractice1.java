package src.exceptionHandlingWays;

public class ExceptionsPractice1 {

    public static void main(String[] args) {

        //try with multiple catch block
        int a;
        int [] b = {1,2,3,4,5};
        try {
            a = 10/2;
            System.out.println(b[10]);
            System.out.println(a);
        }
        catch (ArithmeticException e){
            //System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e){
            //System.out.println(e.getMessage());
            e.printStackTrace();
        }




    }
}
