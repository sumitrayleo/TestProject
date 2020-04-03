package com.test.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListTest_v2 {

    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(new Employee(2, "John", 3000.00),
                                            new Employee(6, "Tom", 2500.00),
                                            new Employee(4, "Serra", 6000.00),
                                            new Employee(9, "Paul", 35000.00));

        // option 1 - using iterator
        Iterator<Employee> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        // option 2 - for-each
        System.out.println();
        for (Employee employee : list) {
            System.out.print(employee);
        }

        // print sorted ArrayList
        sortedList(list);

        // Maintain order of insertion
        List<Employee> linkedList = new LinkedList<>();
        linkedList.add(new Employee(2, "John", 3000.00));
        linkedList.add(new Employee(6, "Tom", 2500.00));
        linkedList.add(new Employee(4, "Serra", 6000.00));

        System.out.println();
        System.out.println("------------Maintain order of insertion List--------------");
        for (Employee str : linkedList) {
            System.out.println(str);
        }
        
        // sorted LinkedList
        sortedList(linkedList);
    }

    private static <T extends Comparable<? super T>> void sortedList(List<T> list) {
        System.out.println();
        System.out.println("------------Sorted List--------------");
        Collections.sort(list);
        for (T str : list) {
            System.out.print(str);
        }
    }

}
