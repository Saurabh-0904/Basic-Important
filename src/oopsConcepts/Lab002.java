package src.oopsConcepts;

public class Lab002 {

    // here we have two functions and both are having different arguments
    //so JVM will check arguments of the which functions are matching
    static int sum (){
        return 99;
    }

    static int sum (int a){
        return a;
    }

    static int sum (int a , int b){
        return a+b;
    }

    // below is a void function which will be not having return
    static void sayHello(){
        System.out.println("Hello");
    }


    public static void main(String[] args) {
        int c = sum();          // No argument
        int c1 = sum(5);     // Single argument
        int c2 = sum(3,4);// 2 arguments
        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);

        sayHello();

    }
}
