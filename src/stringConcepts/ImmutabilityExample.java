package src.stringConcepts;

public class ImmutabilityExample {

    //In below program output of str1 will be Hello not Hello Saurabh coz it is not assigned back
    //if we comment 15th line and if we execute 16th line then we will get Hello Saurabh as an output
    // So this concept is showing by 15th row
    //
    public static void main(String[] args) {

        String name1 = "Saurabh"; // Stored in String Constant Pool
        String name2 = new String("Saurabh"); // Stored in heap area

        name1 = "Bhalerao";

        String str1 = "Hello";
        str1.concat("Saurabh"); //this line shows how String Immutable is
        //str1 = str1.concat(" Saurabh");
        System.out.println(str1);

    }
}
