package com.string.java;

public class CharFrequency {
	public static void charFreq(String s) {

		int count[] = new int[26];
	
		
		for(int i = 0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>='A'&& ch<='Z') {
				count[ch-65]++;
			}
			else if(ch>='a' && ch<='z') {
					count[ch-97]++;
			}
		}
		for(int i =0;i<count.length;i++)	{
			if(count[i]!=0) {
				System.out.println((char)(i+65)+"  --"+count[i]);
			}
		}
}

	public static void main(String[] args) {
		String s = "programming";
		charFreq(s);
	}

}
