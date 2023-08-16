import java.util.*;
//import java.Lang.*;

class SortDemo {

	public static void main(String [] args) {
	
		ArrayList al = new ArrayList();

		al.add("Kanha");
		al.add("Ashish");
		al.add("Shashi");
		al.add("Badhe");
		al.add("Rahul");

		System.out.println(al);

		Collections.sort(al);

		System.out.println(al);
	}
}
