import java.util.Iterator;
import java.util.ArrayList;

class IteratorDemo {

	public static void main(String [] args) {
	
		ArrayList al = new ArrayList();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add("Rajkumar");

		//System.out.println(al);
		Iterator itr = al.Iterator();

		while(itr.hasNext()){

			if("Rahul".equal(itr.next())){

				itr.remove();
			}

			System.out.println(itr.next());
		}
	}
}
