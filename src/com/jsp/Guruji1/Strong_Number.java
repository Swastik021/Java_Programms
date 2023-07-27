package com.jsp.Guruji1;

public class  Strong_Number {
	public static boolean strong(int n) {
		int temp = n; int sum = 0;
		
		while(temp>0) {
			int last = temp%10;
			
			 int fact = 1;
			
			while(last>0){
			fact = fact*last;
			}
			sum =sum+fact;
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
		System.out.println(strong(145));

	}

}
