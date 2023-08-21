package com.java.array;

public class Selection_Sort {
	public static void sortedArray(int a[]) {
		for(int i =0;i<a.length-1;i++) {
			for(int j =i+1;j<a.length;j++) {
				if( a[i]>a[j]) {
					int temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		int a[]= {34,53,32,10,43,1,9};
		
		sortedArray(a);
		for(int i = 0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		
		
		
	}

}
