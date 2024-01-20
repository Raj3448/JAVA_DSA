import java.util.*;

class Temples implements Comparable{

	String tempName = null;
	String placeName = null;

	Temples(String tempName,String placeName){

		this.tempName = tempName;
		this.placeName = placeName;
	}

	public String toString() {

		return "{" + tempName + " : " + placeName + "}";
	}	

	public int compareTo(Object obj){
	
		return tempName.compareTo(((Temples)obj).tempName);
	}
}
class SortedMapDemo {

	public static void main(String [] args) {
	
		SortedMap sm = new TreeMap();
		
		sm.put("Kedarnath","Uttarakhanda");
		sm.put("Trayambakeshwar","Nashik");
		sm.put("Mahakaleshwar","Ujjain");
		sm.put("Amarnath","Jammu");

		System.out.println(sm);
	}
}
