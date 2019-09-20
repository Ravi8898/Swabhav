package com.techlabs.shopping;

import java.util.ArrayList;
import java.util.List;

public class Order {
	
	public int id;
	private String date;
	private List items=new ArrayList<LineItem>();
	
	public Order(int id, String date) {
		this.id=id;
		this.date=date;
	}
	public void add(LineItem lineItem) {
		
		items.add(lineItem);
	}
	public void getItemCount() {
		items.size();
	}
	public int getId() {
		return id;
	}
	public String getDate() {
		return date;
	}
	public List getItems() {
		return items;
	}
	
	
}
