package src.basics_02;

public class Switch_Case_6 {
    public static void main(String[] args) {

        //Advanced Switch Case
        // if we write -> then we don't need to write break statement
        // -> will add break automatically

        //Disadvantage is it will take only one-liner statement

        int itemCode = 005;

        switch (itemCode){
            case 001 -> System.out.println("It's a Laptop!");
            //System.out.println("This will not support, this is the disadvantage");
            case 002 -> System.out.println("It's a Desktop!");
            case 003,004 -> System.out.println("It's a Mobile phone!");
            default -> System.out.println("Hello");
        }
    }
}
