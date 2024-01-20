import java.util.*;

class SetDemo {

	public static void main(String [] args) {
	
		NavigableSet ns = new TreeSet();

		ns.add("Rajkumar");
		ns.add("Bhiaya");
		ns.add("Aishwarya");
		ns.add("Shraddha");

		System.out.println(ns.floor("Rajkumar"));
		System.out.println(ns.lower("Rajkumar"));
		System.out.println(ns.ceiling("Rajkumar"));
		System.out.println(ns.higher("Rajkumar"));
		System.out.println(ns.pollFirst());
		System.out.println(ns.pollLast());

		System.out.println(ns);
	}
}
