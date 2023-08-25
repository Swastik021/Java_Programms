package com.string.java;

public class Reverse_word_Order {
	public static void  reverseWordOrder(String str) {
		String s[]= str.split(" ");
		for(int i =s.length-1;i>=0;i--) {
		System.out.println(s[i]+" ");
		}
		
	}

	public static void main(String[] args) {

		String str = "Hello Good Morning Swastik";
		reverseWordOrder(str);
		
	}

}
