package src.arrays;

public class Array_01 {
    public static void main(String[] args) {

        //Arrays
        //Collection data

        //INTERVIEW QUE -------------------->>>>>
        //1.What is the difference between the below-mentioned syntaxes?
        //int[] a,b; // here 'a' and 'b' both are arrays
        //int []a,b; // here 'a' is an array but 'b' is a simple int type variable

        //2.Can we declare array with size 0?
        // Yes it will compile also and run also
        //int[] a = new int[0]

        //3.What if we declare an array with negative size like int[] a = new int[-3]?
        // Then here we will get a runtime(Unchecked) Exception i.e. 'NegativeArraySizeException'.
//--------------------------------------------------------------------------------------------------------------------------------
        //Collection of Students names
        //Students -> {"Saurabh","Ankita","Rajendra","Sangita","Jaydev"}
        //Score/marks -> 60,85,46,66,75
//--------------------------------------------------------------------------------------------------------------------------------
        //We can create an array by 4 ways
        //int[] a; // Most preferred Syntax
        //int []a;
        //int a[];
        //int[]a;

        int [] marks_10 = {90,85,59,65,45};
     // int [] marks_10 = {90,true,59,65,45}; // we cannot add values of other datatype other than you declared
     // int [] marks_10 = {90,85.35,59,65,45}; // we cannot add values of other datatype other than you declared

        //[] is a Collection of items

        String [] items = {"Milk","Butter","Eggs","Bread","Coke"};
        // index starts with 0 and length starts from 1
        System.out.println(items[0]);    // This will give you a value at index 0
        System.out.println(items.length); // This will give you a length of items
        System.out.println(items[3]);    // This will give you a value at index 3

        //System.out.println(items[5]);   // If we try to initialize an array at index position at max array size or
                                          //if we try to fetch data from index which is not present,
                                          // so it will throw an Exception "ArrayIndexOutOfBoundsException"

        //Print a whole array Way1
        for (int i = 0; i < marks_10.length ; i++) {
            System.out.println(marks_10[i]);
        }
        //Print a whole array Way2
        for (int i : marks_10){
            System.out.println(i);
        }


    }
}
