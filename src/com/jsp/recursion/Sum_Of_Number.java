package com.jsp.recursion;

public class Sum_Of_Number {
	public static Integer sumOfNumber(int n) {
		if(n==1) {
			return n ;
		}{
			int sum = n+sumOfNumber(n-1);
			return sum;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =100;
		System.out.println(sumOfNumber(n));

	}

}
