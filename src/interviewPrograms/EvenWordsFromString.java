package src.interviewPrograms;

public class EvenWordsFromString {

    public static void main(String[] args) {

        String S1 = "Sky is blue and vast";
        String dataArray [] = S1.split(" ");
        //System.out.println(data[0]);

        for (String word : dataArray) {
            int length = word.length();
            if (length%2 == 0){
                System.out.println("Word is Even : "+word);
            }
        }

    }
}
