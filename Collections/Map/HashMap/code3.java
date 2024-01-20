import java.util.*;

class HashMapDemo {

	public static void main(String [] args) {
	
		HashMap hs = new HashMap();

		hs.put("Rajkumar","Engg");
		hs.put("Sonal","MSc");
		hs.put("Bhiaya","ITI");
		hs.put("Didi","MBA");

		System.out.println(hs);

		//get
		System.out.println(hs.get("Bhiaya"));

		//key
		System.out.println(hs.keySet());

		//value
		System.out.println(hs.values());

		//Entry Set
		System.out.println(hs.entrySet());
	}
}
