package java.exception.demo;

import java.util.Scanner;

public class Exception_Handled {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println( "Enter your first number");
		int n = sc.nextInt();
		System.out.println("Enter your second number");
		int m = sc.nextInt();
		try {
		int k = n/m;
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}

				}
	

	}


