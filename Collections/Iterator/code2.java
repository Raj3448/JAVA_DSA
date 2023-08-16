import java.util.*;

class IteratorDemo {

	public static void main(String [] ragds) {
	
		ArrayList al = new ArrayList();

		al.add(10);
		al.add(25.5);
		al.add(10.5f);
		al.add("Rajkumar");

		Iterator itr = al.iterator();

		System.out.println(itr);

		while(itr.hasNext()){

			System.out.println(itr.next());
		}
	}
}
