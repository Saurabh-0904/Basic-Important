package src.interviewPrograms;

public class EvenNo {
    public static void main(String[] args) {

        //Print odd no's between 1 - 50

        for (int i=1 ; i<=50 ; i++){
            if(i%2 == 0){       // other way to change odd and even concept use '!' e.g (!(i%2 == 0)) this will give odd nos
                System.out.println(i + " is a Even  ");
            }
        }

    }
}
