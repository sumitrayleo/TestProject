package com.test.java.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSortingWithComparable {

    public static void main(String[] args) {
        List<InventoryComparable> list = new ArrayList<InventoryComparable>();

        InventoryComparable inv1 = new InventoryComparable(0, "first Inventory", 35.46);
        InventoryComparable inv2 = new InventoryComparable(1, "second Inventory", 23.46);
        InventoryComparable inv3 = new InventoryComparable(2, "third Inventory", 45.46);
        InventoryComparable inv4 = new InventoryComparable(3, "fourth Inventory", 3.46);
        InventoryComparable inv5 = new InventoryComparable(3, "fourth Inventory", 3.46);

        list.add(inv1);
        list.add(inv2);
        list.add(inv3);
        list.add(inv4);
        list.add(inv5);

        Collections.sort(list);

        for (InventoryComparable inv : list) {
            System.out.println("Comparable --> Id:" + inv.getId() + " Desc:" + inv.getDesc() + " Price: " + inv.getPrice());
        }

        System.out.println("Is Equal = " + inv4.compareTo(inv5));

    }

}
