package com.java.array;

public class Lenear_Search {
	public static int linearSearch(int arr[],int key) {
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i]==key) {
				return 1;
			}
		}
		return -1;
		
	}
	public static void main(String args[]) {
		int arr[]= {1212,2313,24,1,452,3};
		System.out.println(linearSearch(arr,211313));
	}

}
