package com.test.fileprocessing;

import java.util.Scanner;

public class FileProcessor_v1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for (int counter = 0; counter < 2; counter++) {
            System.out.println("Enter text and press enter -- ");
            System.out.println(scanner.nextLine());
        }
        
        scanner.close();
    }

}
