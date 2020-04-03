package com.test.fileprocessing;

@SuppressWarnings("serial")
public class MyFileNotFoundException extends Exception{

    public MyFileNotFoundException(String message){
        super(message);
    }
}
