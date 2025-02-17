package src.arrays;

public class JaggedArray {

    //Jagged Array (Array in which no of columns are different)
    // |10|20|30|40|
    // |50|60|
    // |70|80|90|
    // Suppose above-mentioned is an array having 3 rows and different columns so it will call a Jagged Array
    public static void main(String[] args) {
        int[][] a = new int[][]{{10,20,30,40},{50,60},{70,80,90}}; //Declaration-Creation-initialization of array a
/*        int[][] b = new int[3][]; // To declare a Jagged array we need to give only Row count, Here it will be 3
        b[0] = new int[4];
        b[1] = new int[2];
        b[2] = new int[3];*/

/*        System.out.println(b.length); // will print 3, 'b' declared with 3
        System.out.println(b[0].length); // will print 4, b[0] having 4 elements*/

        // How to write a full array
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();

        }

    }





}
