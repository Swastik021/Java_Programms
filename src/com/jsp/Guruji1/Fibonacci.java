package com.jsp.Guruji1;

import java.util.Scanner;

public class Fibonacci {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n =sc.nextInt();
		
		int a = 0,b = 1,temp = 0;		
		System.out.print(a +" ");
		System.out.print(b +" ");
		for(int i =1;i<=n-2;i++);{
			System.out.print(b + " ");
			temp = a;
			a = b;
			b = temp+b;
			System.out.print(b + " ");
			// dont why it is not running
		}
		
	}
	
}
		

