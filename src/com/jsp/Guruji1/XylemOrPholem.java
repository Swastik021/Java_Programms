package com.jsp.Guruji1;


public class XylemOrPholem {
	public static String Xylo(int n) {
		int sum1 = 0;   int count1=0; 
		int sum2 = 0;   int count2=0;int temp=n;
		while(n>0) {
			n=n/10;
			count1++;
		   }
		while(temp>0) {
			int Lastdigit = temp%10;
			count2++;
		    
				if(count2==1 ||count2==count1) {
					sum1 = sum1+Lastdigit;
				}
				else {
					sum2 = sum2+Lastdigit;
				}
				temp = temp/10;
		}
		if(sum1==sum2) {
			return "it is xylem number";
			
		}
		else {
			return "Pholem number";
		}
		
		
		
		
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		System.out.println(Xylo(13338));
		// TODO Auto-generated method stub

	}

}
