package com.jsp.Guruji1;

public class Grds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =101;
		if(a>=90 && a<=100 ) {
			System.out.println(" The student " + a + " is belong to A category");
		}
		else if(a>=80 && a<=89){
			System.out.println(" The student "+a+" is belong to B category");
		}
		else if(a>=70 && a<=79) {
			System.out.println(" The student "+a+" is belong to C category");
		}
		else if(a>=60 && a<=69){	
			System.out.println("The student  "+a+" is belong to D category");
		}
		else if(a>100){	
			System.out.println("The student  "+a+" has More charbi in his ass(Gaand)");
		}
		else if(a<0){	
			System.out.println("The student  "+a+" is chutiya");
		}
		else {
			System.out.println(" The student  "+a+" is belong to Failed category");
		}
	}

}
