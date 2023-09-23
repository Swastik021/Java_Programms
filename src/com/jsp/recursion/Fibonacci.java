package com.jsp.recursion;

public class Fibonacci {
	public static Integer fibonacci(int n) {
		if(n==1||n==2) {
			return 1;
		}
		{
		int sum = fibonacci(n-1)+fibonacci(n-2);
		
			return sum;
			}
		
		
	}

	public static void main(String[] args) {
		
		System.out.println(fibonacci(10));
	}

}
