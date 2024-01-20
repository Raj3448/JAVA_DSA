import java.util.*;
class SortedMapDemo {

	public static void main(String [] args) {
	
		SortedMap sm = new TreeMap();

		sm.put(10,"Ten");
		sm.put(40,"Fourty");
		sm.put(20,"twenty");
		sm.put(30,"Thirty");
		sm.put(12,"Twelve");
		sm.put(9,"Nine");
		sm.put(5,"Five");
		sm.put(8,"Eight");



		System.out.println(sm.subMap(9,20));
		System.out.println(sm.headMap(12));
		System.out.println(sm.tailMap(12));
		System.out.println(sm.firstKey());
		System.out.println(sm.lastKey());
		System.out.println(sm.keySet());
		System.out.println(sm.values());
		System.out.println(sm.entrySet());
		System.out.println(sm);
	}
}
