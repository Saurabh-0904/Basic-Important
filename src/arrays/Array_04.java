package src.arrays;

public class Array_04 {
    public static void main(String[] args) {

        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {1,2,3,4,5};

        // how to print array

/*        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);
        System.out.println(arr1[4]);*/
        // its not a good way

        System.out.println(arr1.length);  // to find out the length
        System.out.println("Reference address = "+ arr1); // This will print memory location

        //Now will use for loop

        for (int i=0 ; i<=arr1.length-1 ; i++){       // in condition if we are adding < only then no need to put (-1) arr1.length
            System.out.println(arr1[i]);
        }












    }
}
