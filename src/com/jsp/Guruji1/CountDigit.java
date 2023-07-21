package com.jsp.Guruji1;
import java.util.Scanner;

public class CountDigit {
	public int countnumber(int n){
		int count=0;

	while(n>0) {
		n= n/10;
		count++;
	}
	return count;
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		{
		System.out.println("Enter Your Number :");
		}
		int n = sc.nextInt();
		CountDigit b =new  CountDigit();
		
		System.out.println(b.countnumber(n));
	}
}
