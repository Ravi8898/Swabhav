package com.techlabs.adapter;

public interface IQueue<T> extends Iterable<T>{

	T deque();
	void enque(T data);
	int getCount(); 
}