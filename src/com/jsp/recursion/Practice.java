package com.jsp.recursion;

public class Practice {
	public static Boolean armStrong(int n) {
		int count = 0;int temp =n;int sum = 0;
		while(temp>=0) {
			
			temp =temp/10;
			count++;
			
			
		}
		temp =n;
		while(temp>=0) {
			
			int last =temp%10;
			{
			for(int i =0;i<=count;i++)
			
			sum = sum+last;
			temp = temp/10;
			
			}
			
			}
			
		
		if(n==temp) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		
		int n = 153;
		System.out.println(armStrong(n));
	}

}
