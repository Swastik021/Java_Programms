package array.method.collection;
import java.util.ArrayList;

public class Demo{
	public static void main(String[] args) {
		
		
		ArrayList a = new ArrayList();
		
		
		a.add(544);
		a.add(123);
		a.add(321);
		a.add(342);
		a.add(768);
		a.add(333);
		System.out.println(a);
		
		ArrayList a2 = new ArrayList();
		a2.add(1);
		a2.add(2);
		a2.add(4);
		a2.add(7);
		System.out.println(a2);
		
		a2.addAll(a);
		System.out.println("Output2 : "+a2);
		a2.remove(3);
		
		System.out.println("Output 3 : "+a2);
		
		
		System.out.println(a2);
		System.out.println(a);
		a2.retainAll(a);
		System.out.println("Output 4 :"+a2);
		
		
	}
}