package com.techlabs.account.test;

public class IterateTest {

	public static void main(String[] args) {
		int index = 0;
		int maxLength = 5;
		int idNo = 1;
		int[] rollNo = new int[maxLength];
		while (index < maxLength) {
			rollNo[index] = idNo;
			System.out.print(rollNo[index] + " ");
			index++;
			idNo++;
		}

	}

}
