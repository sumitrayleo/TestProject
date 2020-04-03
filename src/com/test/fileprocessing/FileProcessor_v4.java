package com.test.fileprocessing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor_v4 {

    public static void main(String[] args) throws MyFileNotFoundException {
        File file = new File("myfile.txt");
        // AutoCloseable
        try (FileReader reader = new FileReader(file); 
                        BufferedReader buffered = new BufferedReader(reader);) {
            String line = buffered.readLine();
            while (line != null) {
                System.out.println(line);
                line = buffered.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new MyFileNotFoundException("File is not found. Please check the name and path");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
