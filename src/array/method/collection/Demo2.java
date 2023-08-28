package array.method.collection;
import java .util.Vector;

public class Demo2 {

	public static void main(String[] args) {
		CustomeArray al = new CustomeArray();
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		System.out.println(al);
		al.add(52);
		al.add(512);

		al.add(51);
		al.add(55);

		al.add(57);
		al.add(59);
		al.add(525);
		System.out.println(al);
		al.removeLast();
		System.out.println(al);
		al.add(1);
		
		
		System.out.println(al);
		Vector v = new Vector();


	}

}
  