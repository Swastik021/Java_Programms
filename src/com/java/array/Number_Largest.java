package com.java.array;
import java.util.Scanner;

public class Number_Largest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int a[]=new int[5];
			for(int i =0;i<a.length;i++) {
				System.out.println("Enter your number  :");
				a[i]=sc.nextInt(); 
			}
			
			
			int largest =a[0];
			for(int i=0;i<a.length;i++) {
				if(largest<a[i]) {
					largest =a[i];
				}
			}

		System.out.println(largest);	
}
		
		
		
		
}		
		
		
		

