package src.oopsConcepts;

public class Lab003 {

    public static void main(String[] args) {

        String name = appBhalerao("Saurabh ");
        System.out.println(name);

    }

    static String appBhalerao (String s){
        System.out.println("Return with Parameter");
        return s + "Bhalerao";
    }
}
