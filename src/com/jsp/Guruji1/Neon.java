package com.jsp.Guruji1;

public class Neon {
	public static boolean neonN(int n) {
		int Sq = n*n;
		int sum =0;
		while(Sq>0) {
			int lastn= Sq%10;
			sum = sum+lastn;
			Sq = Sq/10;
		}
		if(sum==n) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
	

	public static void main(String[] args) {
		System.out.println(neonN(9));
		// TODO Auto-generated method stub

	}

}
