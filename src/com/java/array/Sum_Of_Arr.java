package com.java.array;
import java.util.Scanner;


public class Sum_Of_Arr {


		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
				int a[]=new int[8];
				for(int i =0;i<a.length;i++) {
					System.out.println("Enter your number  :");
					a[i]=sc.nextInt(); 

						}
				int sum = 0;

				for(int i = 0;i<a.length;i++)	{	
			sum =sum +a[i];
				}
			System.out.println(sum+ " Addition ofnumber");
			
		
		

	}
}
