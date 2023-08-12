package com.num.java;
import java.util.Scanner;

public class Pyramid_Star {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in); {
	System.out.println("Enter the number of rows  :");
	}
	int n = sc.nextInt();




//for (int i = 1;i<=n;i++) {
//	
//	for(int k =1;k <=n-i;k++) 
//	{
//		System.out.print(" ");
//	}
//for(int j = 1;j<=i;j++) {
//	System.out.print("*");
//}
//System.out.println();
//}
	
	for(int i =0;i<=n;i++) 
	{
		for(int s=0;s<(n-i);s++)
		{
			System.out.print(" ");
			}
		for(int j =0;j<i*2-1;j++) {
			System.out.print("*");
		}
			System.out.println();
			}
		}
	
	
	
	}
	
	

