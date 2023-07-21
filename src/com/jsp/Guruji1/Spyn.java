package com.jsp.Guruji1;

public class Spyn {
 public static boolean spynumber(int n) {
	 int sum=0; int pro=1; 
	 while(n>0) {
		 int last = n%10;
			 sum = sum+last;
			 pro = pro*last;
			 n = n/10;
			 
		 }
	 
	 
	 if(sum==pro) {
		 return true;
	 }
	 else {
		 return false;
	 }
 }
	public static void main(String[] args) {
		System.out.println(spynumber(123));
		// TODO Auto-generated method stub

	}

}
