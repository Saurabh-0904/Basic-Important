package src.practicePrograms;

public class CharacterOccurence {

    public static void main(String[] args) {

        String name = "saurabh ";
        int counter = 0;


        for(int i=0; i<name.length(); i++){
            for(int j=i+1; j<name.length(); j++){
                if(name.charAt(i)==name.charAt(j)){

                    System.out.println("Duplicate character found :"+ name.charAt(i));
                    counter++;

                }


            }
        }

    }
}
