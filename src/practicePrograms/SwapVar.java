package src.practicePrograms;

public class SwapVar {

    public static void main(String[] args) {
        int a = 10 ;
        int b = 20;
        int c;

        System.out.println("Before swapping "+a+b);
        c=b;
        b=a;
        a=c;

        System.out.println("After swapping "+a+b);
    }
}
