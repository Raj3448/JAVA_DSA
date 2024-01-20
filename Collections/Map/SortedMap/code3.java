import java.util.*;
class NavigableMapDemo {

	public static void main(String [] args) {
	
		NavigableMap nm = new TreeMap();

		nm.put("Kedarnath","Uttarakhanda");
		nm.put("Mahakaleshwar","Ujjain");
		nm.put("Amarnath","Jammu");
		nm.put("Traymbakeshwar","Nashik");

		System.out.println(nm);
	}
}
