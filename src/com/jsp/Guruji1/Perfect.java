package com.jsp.Guruji1;

public class Perfect {
	public static boolean perfectn(int n ) {
		int sum = 0;int temp = n;
		for(int i =1; i<n;i++) {
			if(n%i==0) {
				sum = sum+i;
			}
		}
			if(sum ==temp) {
				return true;
			}
				else {
					return false;
					
				}
			}
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(perfectn(28));
	}

}
