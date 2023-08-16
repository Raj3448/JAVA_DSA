//HashSet using predefined class

import java.util.*;

class HashSetDemo{

	public static void main(String [] args) {
	
		HashSet hs = new HashSet();
		LinkedHashSet lhs = new LinkedHashSet();

		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		Integer num = new Integer("20");
		hs.add(num.hashCode());
		hs.add(new Integer(50));

		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		lhs.add(40);
		lhs.add(new Integer(20));
		lhs.add(new Integer(50));
		
		System.out.println(hs);
		System.out.println(lhs);
	}
}
