package array.method.collection;

public class CustomeArray {

	//public static void main(String[] args) {

		//public class CustomeArray {
			private int data[];
			private int nextElement[];
			
			
			public CustomeArray() {
				data = new int[0];
				nextElement =new int[ 0];
				
			}
			public String ToString() {
				System.out.print("[ ");
				for(int i = 0 ;i<data.length;i++) {
					System.out.println(data[i]+" ,");
				}
				return "]";
			}
		
		public boolean isEmpty() {
			return nextElement==0;
			}
		public int size() {
			return nextElement;
		}
		public void add(int element) {
			if(nextElement==data.length) {
				increamentCapacity();
			}
			data[nextElement]
			}
		
	}

}
