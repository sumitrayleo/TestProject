package com.test.collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest {

    public static void main(String[] args) {
        // Unlike HashMap, LinkedHashMap will maintain the order of insertion
        // If you substitute the Map type to TreeMap, the object will automatically sorted by key
        //Map<Integer, String> map = new TreeMap<>();
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(7, "Sumit");
        map.put(4, "Karen");
        map.put(6, "Piku");
        map.put(2, "Maria");
        map.put(8, "Kartik");

        // Option 1 - iteration
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key) + ";");
        }

        System.out.println("--------------------------------------");

        // Option 2 - Iteration
        for (Entry<Integer, String> set : map.entrySet()) {
            System.out.println("Key: " + set.getKey() + ", Value: " + set.getValue() + ";");
        }
    }

}
