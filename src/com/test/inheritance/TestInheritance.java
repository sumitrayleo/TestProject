package com.test.inheritance;

public class TestInheritance {

    public static void main(String[] args) {
        Moveable pigeon = new Pigeon("two", "two");
        Moveable ostrich = new Ostrich("two", "two");
        Moveable bird = new Bird("two", "two");
        
        canFly(pigeon);
        canFly(ostrich);
        canFly(bird);
    }
    
    private static void canFly(Moveable bird){
        bird.movement();
    }

}
