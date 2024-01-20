import java.util.*;
class HashMapDemo {

	public static void main(String [] args) {
		HashSet hs = new HashSet();

		hs.add("Rajkumar");
		hs.add("Sonal");
		hs.add("Apurva");
		hs.add("Bhaiya");

		System.out.println(hs);

		HashMap hm = new HashMap();

		hm.put("Rajkumar","Engg");
		hm.put("Bhaiya","ITI");
		hm.put("Apurva","MBA");
		hm.put("Sonal","MSc");

		System.out.println(hm);
	}
}
