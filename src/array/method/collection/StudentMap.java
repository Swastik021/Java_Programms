package array.method.collection;
import java.util.Map;
import java.util.LinkedHashMap;
public class StudentMap {
	public static void main(String[] args) {
		Map<Integer,Student> map = new LinkedHashMap<>();
		map.put(1,new Student(1024,"Swastik","swastik@mail.com"));
		map.put(24,new Student(1024,"Swastik","swastik@mail.com"));

		map.put(102,new Student(1024,"Swastik","swastik@mail.com"));

		map.put(124,new Student(1024,"Swastik","swastik@mail.com"));

		map.put(1024,new Student(1024,"Swastik","swastik@mail.com"));

		map.put(4,new Student(1024,"Swastik","swastik@mail.com"));
		System.out.println(map);

		
	}

}
