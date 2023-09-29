package com.pattern.java;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Star numner");
		int n = sc.nextInt();
		int sp = n/2;
		int st = 1;
//		for(int i =1;i<=n;i++) {
//			for(int s=1; s<=n-i;s++) {
//				System.out.print(" ");
//			}
//			for(int j =1 ;j<=i*2-1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
		for(int i=1;i<=n;i++) {
			for(int s=1;s<=sp;s++) {
				System.out.print(" ");
			}
			for(int j = 1;j<=st;j++) {
				if(j==1||j==st) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			if(i<=n/2) {
				st = st+2;
				 sp--;
			}
			else {
				sp++;
				st = st-2;		
			}System.out.println();
			
		}
	}

}
