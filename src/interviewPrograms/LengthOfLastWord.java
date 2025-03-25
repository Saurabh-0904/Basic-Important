package src.interviewPrograms;

public class LengthOfLastWord {

    //Calculate the Length of the Last word of a String

    public static void main(String[] args) {

        String s1 = "     Hello    World    ";
        int count = 0;
        s1=s1.trim();
        //System.out.println(s1); // trim will remove the starting and ending white spaces

        char [] inputArray = s1.toCharArray();
        //System.out.println(inputArray);

        for (int i = inputArray.length-1 ; i>=0 ; i--){
            if (inputArray[i] != ' '){
                count = count+1;
            }
            else {
                if (count>0){
                    System.out.println(count);
                    break;
                }
            }
        }


    }



}
