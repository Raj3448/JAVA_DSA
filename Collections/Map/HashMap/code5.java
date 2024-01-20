import java.util.*;

class Demo {

	public static void main(String [] args) {
	
		IdentityHashMap hm = new IdentityHashMap();

		hm.put(10,2016);
		hm.put(11,2017);
		hm.put(12,2018);
		hm.put(13333,"Rajk");

		System.out.println(hm);
		System.out.println(13%11);
	}
}
