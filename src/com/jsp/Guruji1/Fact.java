package com.jsp.Guruji1;


public class Fact {
	public static int factn(int n) {
		int fac = 1;
		while(n>0) {
			fac = fac*n;
			n--;
			
		}
		
		return fac;
	}
			
		
		
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factn(5));
	}

}
