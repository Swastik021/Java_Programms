package com.jsp.Guruji1;


public class Reversen {
	public static int  Reven(int n) {
		int rev=0;
		while(n>0) {
			int lastnumber = n%10;
			rev= rev*10+lastnumber;
			n= n/10;
		}
		return rev;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Reven(1234));
		

	}

}
