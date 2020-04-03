package com.test.inheritance;

public abstract class Animal implements Moveable {
    
    String eyes;
    
    public Animal(String eyes) {
        super();
        this.eyes = eyes;
    }

    public abstract void eat();
    
    public void breath(){
        System.out.println("Animals can breath");
    }
    
    @Override
    public void movement() {
        System.out.println("Animals move here and there");
    }

}
