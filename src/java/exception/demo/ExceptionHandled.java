package java.exception.demo;

public class ExceptionHandled {

	public static void main(String[] args) {
		int m = 20;
		int n = 0;
		try {
			
		int res =m/n;
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		//System.out.println(res);
		
		
		
	}

}
