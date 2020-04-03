package com.test.functionalinterface.lambda;

public class TestLambdaApplication {

    public static void main(String[] args) {
        Sleepable human = () -> System.out.println("[Lambda] Human are sleeping .. ");
        human.sleep();
        
        Sleepable animal = () -> System.out.println("[Lambda] Animals are sleeping .. ");
        animal.sleep();
    }

}
