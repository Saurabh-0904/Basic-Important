
package src.interviewPrograms;

public class ReverseStringUsingForLoop {

    public static void main(String[] args) {

       String name = "Saurabh";
       String x = "";

        for (int i=name.length()-1 ; i >= 0  ; i--){
            x=x+name.charAt(i);

        }
        System.out.println(x);

    }
}
