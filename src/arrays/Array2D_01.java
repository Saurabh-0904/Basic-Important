package src.arrays;

public class Array2D_01 {
    public static void main(String[] args) {

        // 1D
        int a [] = {1,2,3};

        //2D
        int arr [][] = new int[3][3];
        int [][]arr1 = new int[3][3];

        //|1,2,3|
        //|4,5,6|
        //|7,8,9|

        //Assigning value to Array Row 1
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        //Assigning value to Array Row 2
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        //Assigning value to Array Row 3
        arr[2][0] = 7;
        arr[2][1] = 8;
        arr[2][2] = 9;

       // int [][] arr2  = {{1,2,3},{4,5,6},{7,8,9}}; we can assign by this way also


        // Printing array

        for (int i=0 ; i<a.length ; i++){
            for (int j=0 ; j< arr[i].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }






    }
}
