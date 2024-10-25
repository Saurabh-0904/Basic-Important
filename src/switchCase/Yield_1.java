package src.switchCase;

public class Yield_1 {

    public static void main(String[] args) {

        char code = 'A';
        int val = switch (code){
            case 'A' :
                yield 65;
            case 'B' :
                yield 66;

            default:
                //System.out.println("wrong value"); // we can not use print statement here,
                // as in this case default need a throw statement or else switch will throw an exception
            throw new IllegalStateException("Unexpected vallue: " + code);

        };
        System.out.println(val);
    }
}
