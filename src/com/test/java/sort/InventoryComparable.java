package com.test.java.sort;

public class InventoryComparable implements Comparable<InventoryComparable>{

	int id;
	String desc;
	double price;
	
	public InventoryComparable(int id, String desc, double price){
		this.id = id;
		this.desc = desc;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int compareTo(InventoryComparable arg0) {
		double priceDiff = this.price - arg0.price;
		return priceDiff < 0 ? -1 : priceDiff == 0 ? 0:1;
	}

}
