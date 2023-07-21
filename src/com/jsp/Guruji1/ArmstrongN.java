package com.jsp.Guruji1;

public class ArmstrongN {
	public static boolean Armstrongn(int n) {
		int sum = 0;
		int count=0; int temp = n;
		while(temp>0) {
			temp = temp/10;
			count++;
		}
		temp = n;
		while(temp>0) {
			int lastnumber = temp%10;
		int pro = 1;
		for(int i =1; i <=count; i++) {
		pro = pro*lastnumber;
		}
		sum =sum+pro;
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
		{
		System.out.println(Armstrongn(153));
		}
	}

}
