package src.practicePrograms;

public class PrimeNo {

    public static void main(String[] args) {
        //Prime no

        int num = 4;
        int flag = 0;

        for(int i=2; i<=num-1; i++){

            if(num%i==0){

                flag=1;
            }
        }
        if(flag==0){
            System.out.println(num + " is a Prime No.");
        }
        else
        {
            System.out.println(num + " is not a Prime No.");
        }
    }
}
