package com.jsp.Guruji1;
import java.util.Scanner;

public class Right_Tri{
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		{
			System.out.println("Enter the number of star you want to print : ");
		}
		int n = sc.nextInt();
			
				
//				for(int s = 0;s<n-i;s++)
//				{
//				
//					System.out.print(" ");
//				}
//				for(int j =0;j<2*i-1;j++)
//				{
//				
//		         System.out.print("*");
//		            }
//				System.out.println();
//	
//			}
		
//	}
		
		for(int i =1;i<=n;i++) 
		{	
				for(int s =0;s<n-i;s++) {
					System.out.print(" ");
					}
				for(int j =0;j<i;j++) {
					System.out.print(i%4);
				}
				System.out.println();
				}
				
				
			}
} 
	
	

	
	
