package com.test.java.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestSortingWithComparator {

    public static void main(String[] args) {
        List<Inventory> list = new ArrayList<Inventory>();

        Inventory inv1 = new Inventory(0, "first Inventory", 35.46);
        Inventory inv2 = new Inventory(1, "second Inventory", 23.46);
        Inventory inv3 = new Inventory(2, "third Inventory", 45.46);
        Inventory inv4 = new Inventory(3, "fourth Inventory", 3.46);
        Inventory inv5 = new Inventory(3, "fourth Inventory", 3.46);

        list.add(inv1);
        list.add(inv2);
        list.add(inv3);
        list.add(inv4);
        list.add(inv5);

        Collections.sort(list, new InventoryComparator());

        System.out.println("Comparator --> ");
        for (Inventory inv : list) {
            System.out.println("Id:" + inv.getId() + " Desc:" + inv.getDesc() + " Price: " + inv.getPrice());
        }

        // Equal compare
        System.out.println("\nIs Equal = " + new InventoryComparator().compare(inv4, inv5) + "\n");

        // Reverse Order
        Comparator<Inventory> reverseComparator = Collections.reverseOrder(new InventoryComparator());
        Collections.sort(list, reverseComparator);

        System.out.println("Reverse Comparator --> ");
        for (Inventory inv : list) {
            System.out.println("Comparator --> Id:" + inv.getId() + " Desc:" + inv.getDesc() + " Price: " + inv.getPrice());
        }

    }

}
