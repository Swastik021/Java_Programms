package com.jsp.recursion;

public class Square {
	public static Integer square(int n,int r) {
		if(r==0) {
			return 1 ;
		}
		{
			int s = n*square(n,r-1);
					return s;
		}
	}


	
	public static void main (String args[]) {
	int n =5;
	int r = 3;
	
	System.out.println(square(n,r));
	
	}
}
