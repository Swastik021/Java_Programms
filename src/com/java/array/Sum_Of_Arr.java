package com.java.array;
import java.util.Scanner;
public class Sum_Of_Arr {
public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			int n = sc.nextInt();
				int a[]=new int[n];
				for(int i =0;i<a.length;i++) {
					System.out.println("Enter your number  :");
			       	 a[i]=sc.nextInt(); 

						}
				for(int i =0;i<a.length;i++) {
					System.out.print(a[i]+" ");
				}
				{
					System.out.println(" ");
				int sum = 0;
				for(int i = 0; i<a.length;i++) {
					sum = sum+a[i];
				}
				System.out.println(sum);
					}
				for(int i =0;i<=a.length-1;i++) {
					for(int j =i+1;j<a.length;j++) {
						if(a[i]>a[j]) {
							int temp = a[i];
							a[i]=a[j];
							a[j]=temp;
						}
					}
					System.out.print(a[i]+" ");
					
				}	System.out.println(a[1]+" Second highest number");
	}
}
