package com.techlabs.adapter.test;

import com.techlabs.adapter.IQueue;
import com.techlabs.adapter.QueueAdapter;

public class AdapterTest {

	public static void main(String[] args) {
		
		IQueue<Integer> q=new QueueAdapter<Integer>();
		q.enque(10);
		q.enque(20);
		q.enque(30);
		
		System.out.println("Total no of element is: "+q.getCount());
		System.out.println("Removed element is: "+q.deque());
		System.out.println("Total no of element is: "+q.getCount());
		
		for(Integer item:q) {
			System.out.println(item);
		}
		
	}

}
