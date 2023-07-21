package com.jsp.Guruji1;
import java.util.Scanner;

public class rvcstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter  Your number   ");
		
		int n = sc.nextInt();
		
		int rev = 0;
		
		while(n>0)
		{
			rev =  rev*10 + n%10 ;
			n = n/10;
		}
		System.out.println("Reverse number is " +rev);
	}

}
