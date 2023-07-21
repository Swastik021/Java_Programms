package com.jsp.Guruji1;

public class PrimeNumber {
	public  static boolean Number(int n) {
		int count = 0;
	
			for (int i =1; i<=n;i++) {
				if(n%i==0) {
					count++;
				}
	
			}
			if(count ==2) {
				return true;
			     }
			else
			{
				return false;
			}
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Number(13));

	}

}
