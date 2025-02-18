package src.practicePrograms;

public class Fibonnaci {

    //Fibonnaci series up to 20

    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c=0;

        System.out.print(a+" "+b);

        while(c<20)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.print(" "+c);

        }
    }
}
