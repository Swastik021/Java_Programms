package com.jsp.Guruji1;
import java.util.Scanner;

public class aCtor {
	public static void factr(int n) {
		int count = 0;
	
		for(int i = 1; i<=n;i++) {
			if(n%i==0)
				System.out.println(i);
		
		}
	}
		
		
	


  public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		{

		System.out.println("Enter Your Number  :");
		}
		int n = sc.nextInt();
		//aCtor s = new aCtor();
		factr(n);
		

  }
  }