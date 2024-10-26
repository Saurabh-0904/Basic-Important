package src.arrays;

public class Array_01 {
    public static void main(String[] args) {

        //Arrays
        //Collection data

        //Collection of Students name
        //Students -> {"Saurabh","Ankita","Rajendra","Sangita","Jaydev"}

        //Score/marks -> 60,85,46,66,75

        int [] marks_10 = {90,85,59,65,45};
     // int [] marks_10 = {90,true,59,65,45}; // we can not add values of other datatype otherthan you declared
     // int [] marks_10 = {90,85.35,59,65,45}; // we can not add values of other datatype otherthan you declared

        //[] is Collection of items

        String [] items = {"Milk","Butter","Eggs","Bread","Coke"};

        System.out.println(items[0]);    // This will give you value at 0 index
        System.out.println(items.length); // This will give you a length of items
        System.out.println(items[3]);    // This will give you value at 3 index

        //System.out.println(items[5]);   // we have entered wrong idex which is not having any value,
                    // so it will throw an Exception

        //ArrayIndexOutOfBoundsException

        // index starts with 0 and length starts from 1


    }
}
