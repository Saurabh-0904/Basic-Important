package src.interviewPrograms;

public class EvenOddUsingContinue {
    public static void main(String[] args) {

        for (int i=1 ; i<=10 ; i++){
            if(i%2 == 0) {
                System.out.println("Value is Even =" + i);
                continue;
            }
            System.out.println("Value is Odd ="+ i);
        }

    }
}
