package src.practicePrograms;

public class SwapVarWithoutThirdVar {

    public static void main(String[] args) {
        int a = 10 ;
        int b = 20;


        System.out.println("Before swapping "+a +" "+b);
        a=a+b; // a=30 b=20
        b=a-b; // a=30 b=10
        a=a-b; // a=20 b=10

        System.out.println("After swapping "+a +" "+b);
    }
}
