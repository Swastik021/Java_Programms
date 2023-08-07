package com.num.java;

public class LogicalQuestion {
	public static void main (String args[]){
		int n =5;
	int a = 10; int b = 20;
	int c;
	System.out.print(a + " " +b );
	for(int i =1;i<=n;i++) {
		c = a;a=b;b=b+c;
		System.out.print(" " +c);
		
	}
	
	
	
	
	}
	
	
}
