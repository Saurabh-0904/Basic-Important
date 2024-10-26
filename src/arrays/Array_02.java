package src.arrays;

public class Array_02 {
    public static void main(String[] args) {

        int [] marks = {85,95,65,54};
        System.out.println(marks.length);  //4
        System.out.println(marks[0]); //85
        System.out.println(marks[1]); //95
        System.out.println(marks[2]); //65
        System.out.println(marks[3]); //54
      //System.out.println(marks[4]); //it will throw an exception

        //index - 0 to (length-1)

        int [] a = new int[4];
        //a -> [0,0,0,0]   -> Default value of integer -> that is 0

        System.out.println(a[0]); //0
        System.out.println(a[1]); //0
        System.out.println(a[2]); //0
        System.out.println(a[3]); //0

        a[0] = 78;

        System.out.println(a[0]); // 78
        a[1]= 91;
        a[0]= 40;


        final int [] b = new int[4];  // We have used a final keyword here so it will final array length only not values
        // b -> [0,0,0,0]
        b[0]=55;               // So we can assign values
        System.out.println(b[0]); // 55


    }
}
