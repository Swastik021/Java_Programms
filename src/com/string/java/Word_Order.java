package com.string.java;

public class Word_Order {
	//public static String reversWord(String str) {
		public static void reversWord(String str){
			String s[]= str.split(" ");
			for(int i=s.length-1;i>=0;i--) {
				System.out.println(s[i]+" ");
			}
			
			
		}
		

	
	
	public static void main(String[] args) {
		String str = "Hello Good Morning";
		reversWord(str);
		
		

	}

}
