package src.exceptionHandlingWays;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionsPractice6 {

    public static void main(String[] args) {

        //
        System.out.println(System.getProperty("user.dir"));
        File myfile = new File(System.getProperty("user.dir")+ "\\src\\demo.txt");
        FileReader fr;
        BufferedReader br = null;
        try {
            fr = new FileReader(myfile);
            br = new BufferedReader(fr);
            System.out.println(br.readLine());
        } catch (IOException e) { // Here we have removed FileNotFoundException coz IOException is related to FileNotFoundException and FileNotFoundException extends IOException
            e.printStackTrace();
        }



    }
}
