package com.java.array;

public class Insertion_Sort {

	public static void main(String[] args) {
		int a[]= {12,21,4,44,32,1};
		int res[] = sortedArr(a);
		for(int i = 0;i<res.length;i++) {
			System.out.println(res[i]+" ");
			
		}

	}
public static int[] sortedArr(int[] a) {
	for(int i =0;i<a.length;i++) {
		int current =a[i];
		int j = i-1;
		while(j>=0 && current<a[j]) {
			a[j+1]=a[j];
			j--;
		}
		a[j+1]=current;
	}
	return a;
	
}
}
