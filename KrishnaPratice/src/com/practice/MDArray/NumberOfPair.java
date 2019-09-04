package com.practice.MDArray;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class NumberOfPair {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t-->0)
		{
			int xsize=sc.nextInt();
			int ysize=sc.nextInt();
			
			int X[] = new int[xsize];
			int Y[] = new int[ysize];
			
			for(int i=0;i<xsize;i++) {
				X[i]=sc.nextInt();
			}
			
			for(int i=0;i<ysize;i++) {
				Y[i]=sc.nextInt();
			}
			
			X=SortingArray(X);
			Y=SortingArray(X);
			
			int i=0;//initializinf index for X array
			int count=0;
			int j=0;//Initializing an index for Y array
			while(i<xsize) {
				
				if(X[i]==0) {
					i++;
				}
				if(X[i]==1) {
					count+=CountZero(Y);//if x = 1, then count is total no of 0s in Y[] only.
					i++;
				}
				if(X[i]==2) {
					int index=Arrays.binarySearch(Y, 2);
				}
				
				
			}
			
			
			
			
			
		}
		
		
		
	}

	private static int CountZero(int[] y) {
		// TODO Auto-generated method stub
		int i=0;
		int count=0;
		while(i<y.length) {
			if(y[i]==0) {
				count++;
				i++;
			}
			else {
				break;
			}
		}
		return count;
	}

	private static int[] SortingArray(int[] x) {
		// TODO Auto-generated method stub
		TreeSet<Integer> t = new TreeSet<Integer>();
		for(int a:x) {
			t.add(a);
			
		}
		int i=0;
		for (int a : t) {
			x[i]=a;
			i++;
		}
		
		return x;
	}
}
