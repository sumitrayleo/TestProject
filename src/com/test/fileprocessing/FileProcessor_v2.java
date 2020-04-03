package com.test.fileprocessing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileProcessor_v2 {

    public static void main(String[] args) {
        File file = new File("myfile.txt");
        
        Scanner scanner;
        try {
            scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
       
    }

}
