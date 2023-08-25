package com.string.java;

public class Palndrome_Str {
	public static boolean palindro(String s) {
		int low = 0;
		int high = s.length()-1;
		while(low<high) {
			if(s.charAt(low)!=s.charAt(high)) {
				return false;
			}
			else
			{
				low++;
			high--;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "madam";
		System.out.println(palindro(s));
		
	}

}
