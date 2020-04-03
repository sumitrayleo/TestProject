package com.test.inheritance;

public class Bird extends Animal {

    String wings;

    public Bird(String eyes, String wings) {
        super(eyes);
        this.wings = wings;
    }

    @Override
    public void eat() {
        System.out.println("Birds eat grains");
    }

    @Override
    public void movement() {
        System.out.println("Birds can fly");
    }

}
