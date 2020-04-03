package com.test.functionalinterface.lambda;

public class TestLambdaApplication {

    public static void main(String[] args) {
        Sleepable human = () -> System.out.println("[Lambda] Human are sleeping .. ");
        human.sleep();
        
        Sleepable animal = () -> System.out.println("[Lambda] Animals are sleeping .. ");
        animal.sleep();
        
         LambdaType sumOfTwoNumbers = (args1, args2) -> (args1 + args2); 
         System.out.println("Sum = " + sumOfTwoNumbers.someMethod(7, 2));
    }

}
