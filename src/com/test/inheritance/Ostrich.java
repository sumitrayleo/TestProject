package com.test.inheritance;

public class Ostrich extends Bird {
    
    public Ostrich(String eyes, String wings) {
        super(eyes, wings);
    }
    
    @Override
    public void movement() {
        System.out.println("Ostrich cannot fly");
    }
}
