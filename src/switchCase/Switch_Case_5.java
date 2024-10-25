package src.switchCase;

public class Switch_Case_5 {
    public static void main(String[] args) {

        //Advanced Switch
        //You can match multiple conditions
        // After JDK 13 only (before jdk13 it will not support)

        int itemCode = 007;

        switch (itemCode)
        {
            case 001, 002, 003 :
                System.out.println("Its an Electronic Gadget!");
                break;

            case 004, 005 :
                System.out.println("Its a Mechanical device!");
                break;

            default:
                System.out.println("Its a Software product!");

        }
    }
}
