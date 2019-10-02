package com.techlabs.adapter;

import java.util.Iterator;
import java.util.LinkedList;

public class QueueAdapter<T> implements IQueue<T>{

	private LinkedList queue = new LinkedList();
	private int count=0;
	
	@Override
	
	public T deque() {		
		count--;
		return (T) queue.removeFirst();
	}

	@Override
	public void enque(T data) {
		queue.addLast(data);
		count++;
	}
	
	@Override
	public int getCount() {	
		return count;
	}

	@Override
	public Iterator<T> iterator() {
			
		return queue.iterator();
	}

	
}
