package com.num.java;

public class Patant_Wala_Square {

	public static void main(String[] args) {
int n =7;int st = 1;
int sp = 3;   
for(int i = 1;i<=n;i++) {
	for(int s=1;s<=sp;s++) {
		System.out.print(" ");
	}
	for(int j=1;j<=st;j++) {
		//if(j==1||j==st) {
		System.out.print(j);
		//}else {
			//System.out.print(" ");
	//	}
	}
	if(i<=n/2) {
		st = st +2;
		sp--;
	
	}else {
		st = st-2;
		sp++;
	}
	System.out.println(
			);

}

	}

}
