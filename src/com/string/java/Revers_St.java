package com.string.java;

public class Revers_St {
	public static String reverSe(String str) {
		String rev="";
		for(int i = 0;i<str.length();i++) {
			
			rev = str.charAt(i) + rev;
		}
		return rev;
		
	}
	public static void main (String args[]) {
		String s1 = "Good Morning";
		System.out.println(reverSe(s1));
		
		
		
	}

}
