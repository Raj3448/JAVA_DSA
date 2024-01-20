import java.util.*;

class HashSetDemo {

	public static void main(String [] args) {

		HashMap hm1 = new HashMap();

		hm1.put(new Integer(10),"C2w");
		hm1.put(new Integer(10),"Biencaps");
		hm1.put(new Integer(10),"Incubator");

		System.out.println(hm1);
	
		IdentityHashMap hm = new IdentityHashMap();

		hm.put("Rajkumar","HJKL");
		hm.put("Bhiaya","HJKL");
		hm.put("Sonal","HJKL");
		hm.put("Didi","HJKL");
		hm.put("Didi","HJKL");

		System.out.println(hm);
	}
}
