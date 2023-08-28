package com.java.array;
import java.util.Scanner;

public class LargestNo {
	public static void main (String args[]) {
//		Scanner sc = new Scanner(System.in);
//		int a[]=new int[5];
//;		for(int i =0;i<a.length;i++) {
//	System.out.println(" Enter the number : ");
//
//		 a[i]=sc.nextInt(); 
//		
//	}
		int a[]= {222,43,24,424,545};
	int largest= a[0];
for(int i =0;i<a.length;i++) {
	if(largest < a[i]) {
		largest = a[i];
	}
	
	}
		
	System.out.println(largest+" This number is highest   ");
}
}

