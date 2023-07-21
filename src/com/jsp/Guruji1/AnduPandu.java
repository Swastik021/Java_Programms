package com.jsp.Guruji1;
import java.util.Scanner;

public class AnduPandu {

	public static void main(String[] args) {
		 
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
   	 System.out.println("Enter Your number : ");

		int a =sc.nextInt();
		int b =sc.nextInt();{
			System.out.println(a+"  "+b+" Before Swaping number");
		}

		int temp = a;
		a=b;
		b=temp;{
			System.out.println(a+" "+b+" After Swasping number");
		}
     
	}

}
