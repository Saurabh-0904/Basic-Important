package src.arrays;

public class Array_03 {
    public static void main(String[] args) {

        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {1,2,3,4,5};

        //Once array initialised we can not change array size
        //We can change only values

        //Above both arrays are having same values
        //So they are not same coz even values are same but references are different

        System.out.println(arr1==arr2); // will give false as references are different

        int [] arr3 = arr1; // Here we have assigned array 1 to array 3 so here references will be same
        // So it means both arrays are same

        System.out.println(arr1==arr3); // will give true as both arrays pointing to same reference

        System.out.println(arr1.equals(arr2));  // here also references are compared not values so it will give false

        arr3 [0] = 24;               // here we have assigned value '24' at 0 index of array 3
        System.out.println(arr1[0]);
        System.out.println(arr3[0]);
        // above both statement will print 24 as both arrays are pointing to same reference












    }
}
