package src.basics_02;

public class For_Loop_1 {
    public static void main(String[] args) {

        // print value of i and break it at 5

        for (int i=1 ; i<=10 ; i++){

            if(i==5) {
                break;
            }
            System.out.println("Value of i = " + i);
        }
        System.out.println("END");
    }
}
