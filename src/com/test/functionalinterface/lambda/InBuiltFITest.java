package com.test.functionalinterface.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class InBuiltFITest {

    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
            new Car("Honda", "Accord", "Grey", 16000),
            new Car("Toyota", "Camry", "Beige", 12000),
            new Car("Kia", "Motor", "Blue", 11000),
            new Car("Hyundai", "Accent", "Grey", 10000)
            );
        
        // Use in-built @FunctionalInterface - Function<T, R>
        Function<Car, String> getCarAsString = (c) -> "Color = " + c.getColor() + " Price = " + c.getPrice();
        System.out.println(getCarAsString.apply(cars.get(0)));
        
        System.out.println("Print all Cars whose price is between 11000 and 15000 .... ");
        for(Car car : cars){
            // here we are passing by code
            if(compute(car, (c) -> c.getPrice() >= 11000 && c.getPrice() <= 15000)){
                car.printCar();
            }
        }
        
        System.out.println("Print all Cars whose color is BLUE .... ");
        for(Car car : cars){
            // here we are passing by code
            if(compute(car, (c) -> "Blue".equalsIgnoreCase(c.getColor()))){
                car.printCar();
            }
        }

    }
    
    // Used in-built @FunctionalInterface - Predicate<T>
    private static <T> boolean compute(T t, Predicate<T> predicate){
        return predicate.test(t);
    }

}
