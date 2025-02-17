package src.arrays;

import java.util.HashSet;

public class DuplicatesElementInArray {


    public static void main(String[] args) {

        //find duplicates

        String[] arr = {"red","black","white","red","Black"};

        //Approach 1

        /*boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {

                if(arr[i] == arr[j]){
                    System.out.println("Found Duplicate Element : "+ arr[i]);
                    flag=true;
                }
                
            }
            
        }
        if (flag==false){
            System.out.println("Duplicate Element not found");
        }*/

        //Approach 2: Using HashSet - HashSet will not accept duplicates
        HashSet <String> langs = new HashSet();
/*        System.out.println(langs.add("java"));
        System.out.println(langs.add("c++"));
        System.out.println(langs.add("java"));
        System.out.println(langs.add("python"));
        System.out.println(langs);*/

        boolean flag = false;
        for (String l :arr) {
            if(langs.add(l)==false){
                System.out.println("Found Duplicate Element : " + l );
                flag = true;
            }
        }

        if (flag==false){
            System.out.println("Not found Duplicates");
        }




    }
}
