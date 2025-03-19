package src.exceptionHandlingWays;

import java.io.*;

public class ExceptionsPractice4 {

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
        finally {
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
