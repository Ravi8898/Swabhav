package com.techlabs.generic.node.test;

import com.techlabs.generic.node.Node;

public class NodeTest {

	public static void main(String[] args) {

		Node<Integer> n1 = new Node<Integer>();
//		n1.setData("10");
		n1.setData(10);
		Node<Integer> n2 = new Node<Integer>();
		n2.setData(20);
		Node<Integer> n3 = new Node<Integer>();
		n3.setData(30);
		n1.setNext(n2);
		n2.setNext(n3);

		printInfo(n1);

	}

	public static void printInfo(Node<Integer> node) {

		while (node != null) {
			System.out.println(node.getData());
			System.out.println(node.getNext());
			node = node.getNext();

		}
	}
}
