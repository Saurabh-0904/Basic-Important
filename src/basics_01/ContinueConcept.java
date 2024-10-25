package src.basics_01;

public class ContinueConcept {

    public static void main(String[] args) {

        //Continue - ? If this true -> Continue

        for (int i=0 ; i< 10 ; i++){
            System.out.println(i);
            if (i == 5) continue;
            System.out.println("***After");    // this will not print once above condition got true

        }
    }
}
