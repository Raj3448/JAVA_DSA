import java.util.*;

class IteratorDemo {

	public static void main(String [] ragds) {
	
		ArrayList al = new ArrayList();

		al.add(10);
		al.add(25.5);
		al.add(10.5f);
		al.add("Rajkumar");

		for(var data:al){
		
			System.out.println(data.getClass().getName());
		}
	}
}
