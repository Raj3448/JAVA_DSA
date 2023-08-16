import java.util.*;

class HashSetDemo {

	public static void main(String [] args) {
	
		HashSet hs = new HashSet();
		LinkedHashSet lhs  = new LinkedHashSet();

		hs.add("Rajkumar");
		hs.add("Chavan");
		hs.add("Suhas");
		hs.add("Chavan");
		hs.add("Sonal");
		hs.add("Apurva");
		hs.add("bhaiya");
		hs.add("jhsjh");
		
		lhs.add("Rajkumar");
		lhs.add("Chavan");
		lhs.add("Suhas");
		lhs.add("Chavan");
		lhs.add("Sonal");
		lhs.add("Apurva");
		lhs.add("bhaiya");
		lhs.add("jhsjh");

		System.out.println(hs);
		System.out.println(lhs);
	}
}
