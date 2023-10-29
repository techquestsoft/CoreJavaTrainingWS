package com.techquestsoft.training.java9features;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FinalVariable1 {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fileStream = new FileOutputStream("javatpoint.txt");
        try (fileStream) {
            String greeting = "Welcome to javaTpoint.";
            byte b[] = greeting.getBytes();
            fileStream.write(b);
            System.out.println("File written");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
