package com.test.inheritance;

public class Pigeon extends Bird {

    public Pigeon(String eyes, String wings) {
        super(eyes, wings);
    }
    
    @Override
    public void movement() {
        System.out.println("Pigeon can fly long distances");
    }
}
