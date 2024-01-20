import java.util.*;
class SortedSetDemo {

	public static void main(String [] args) {
	
		SortedSet ss = new TreeSet();


		ss.add("Rajkumar");
		ss.add("Abhishek");
		ss.add("Sanket");
		ss.add("Ritesh");
		ss.add("Bunty");
		ss.add("Omkar");

		System.out.println(ss);

		System.out.println

		System.out.println(ss.headSet("Rajkumar"));
		
		System.out.println(ss.tailSet("Rajkumar"));
		
		System.out.println(ss.subSet("Bunty","Ritesh"));
	}
}
