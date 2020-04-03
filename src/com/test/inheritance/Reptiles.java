package com.test.inheritance;

public class Reptiles extends Animal {
    
    public Reptiles(String eyes, String scales) {
        super(eyes);
        this.scales = scales;
    }

    String scales;
    
    
    @Override
    public void eat() {
        System.out.println("Reptiles are carnivores");
    }

    @Override
    public void movement() {
        System.out.println("Reptiles can swiggle");
    }

}
