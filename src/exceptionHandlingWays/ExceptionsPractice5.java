package src.exceptionHandlingWays;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionsPractice5 {

    public static void main(String[] args) {

        try{
            int a = 10/0;
        }
        finally {
            System.out.println("Hello I am in Finally block");
        }


    }
}
