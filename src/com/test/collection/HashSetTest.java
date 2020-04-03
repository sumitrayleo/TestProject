package com.test.collection;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class HashSetTest {

    public static void main(String[] args) {
        List<Employee> collection = Arrays.asList(new Employee(2, "John", 3000.00),
            new Employee(6, "Tom", 2500.00),
            new Employee(4, "Serra", 6000.00),
            new Employee(4, "Serra", 6000.00),
            new Employee(9, "Paul", 35000.00));
        
        // Unlike HashSet, LinkedHashSet will maintain the order of insertion
        Set<Employee> hashSet = new LinkedHashSet<>(collection);
        
        // without hashCode implemented the Employees with id 4 will show as equal object 
        // Once the hashCode method is implemented in Employee class, the HashSet checks the hasCode of the objects 
        // (Employees) and not the hashCode of its super class
        if(collection.get(3).equals(collection.get(2))){
            System.out.println("Employees are equal");
        }
        
        for(Employee emp : hashSet){
            System.out.println(emp);
        }
    }

}
