package com.test.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListTest_v1 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Hello", "World", "Sample");

        // option 1 - using iterator
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        // option 2 - for-each
        System.out.println();
        for (String str : list) {
            System.out.print(str + " ");
        }

        // print sorted ArrayList
        sortedList(list);

        // Maintain order of insertion
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Zoo");
        linkedList.add("Animal");
        linkedList.add("Visitor");

        System.out.println();
        System.out.println("------------Maintain order of insertion List--------------");
        for (String str : linkedList) {
            System.out.println(str + " ");
        }
        
        // sorted LinkedList
        sortedList(linkedList);
    }

    private static void sortedList(List<String> list) {
        System.out.println();
        System.out.println("------------Sorted List--------------");
        Collections.sort(list);
        for (String str : list) {
            System.out.print(str + " ");
        }
    }

}
