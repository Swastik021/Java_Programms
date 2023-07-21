package com.jsp.Guruji1;

public class Strong {
	public static boolean strongn(int n ) {
		int sum =0; int temp = n;
		while(temp>0) {
			int last = temp%10;
			int fact = 1;
			while(last>0) {
				fact = fact*last;
				last--;
			}
			sum = sum+fact;
			temp = temp/10;
		}
		  if(sum==n) {
			return true;
		  }
			 else {
				return false;
			}
		}
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(strongn(145));
	}

}
