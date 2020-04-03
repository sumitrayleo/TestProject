package com.test.java.sort;

import java.util.Comparator;

public class InventoryComparator implements Comparator<Inventory> {

    @Override
    public int compare(Inventory arg0, Inventory arg1) {
        double priceDiff = arg0.price - arg1.price;
        return priceDiff < 0 ? -1 : priceDiff == 0 ? 0 : 1;
    }
}
