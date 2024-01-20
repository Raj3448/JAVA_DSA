//Applying Iterator over the Map
import java.util.*;

class SortedMapDemo {

	public static void main(String [] args) {
	
		SortedMap sm = new TreeMap();

		sm.put("Kedarnath","Uttarakhanda");
		sm.put("Mahakaleshwar","Ujjain");
		sm.put("Amarnath","Jammu");
		sm.put("Trymbkeshwar","Nashik");

		System.out.println(sm);

		Set<Map.Entry> data = sm.entrySet();

		System.out.println(data);

		Iterator<Map.Entry> itr = data.iterator();

		while(itr.hasNext()) {

			Map.Entry data1 = itr.next();
			System.out.println("{"+ data1.getKey() + " : " + data1.getValue()+"}");
		}
	}
} 
