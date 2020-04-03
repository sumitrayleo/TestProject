package com.test.fileprocessing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor_v3 {

    public static void main(String[] args) throws MyFileNotFoundException {
        File file = new File("myfile1.txt");
        BufferedReader buffered = null;
        FileReader reader = null;
        try {
            reader = new FileReader(file);
            buffered = new BufferedReader(reader);
            String line = buffered.readLine();
            while (line != null) {
                System.out.println(line);
                line = buffered.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new MyFileNotFoundException("File is not found. Please check the name and path");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (buffered != null) {
                    buffered.close();
                }

                if (reader != null) {
                    reader.close();
                }

            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }

}
