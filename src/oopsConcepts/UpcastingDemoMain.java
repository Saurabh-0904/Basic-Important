package src.oopsConcepts;

public class UpcastingDemoMain {

    public static void main(String[] args) {
        UpcasetingDemoSuperclass obj = new UpcastingDemoChildClass();
        obj.method();
        String name = obj.name;
        System.out.println(name);
    }
}
