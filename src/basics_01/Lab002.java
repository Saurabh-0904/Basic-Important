package src.basics_01;

public class Lab002 {

    public static void main(String[] args) {
        byte age = 10 ; // Range of byte is -128 to 127
        age = 127; // Out of range
        System.out.println(age+1);

        // Here age is a local variable

        short age2 = 128; // Range of short is -32768 to 32767
        System.out.println(age2);
    }
}
