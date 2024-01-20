import java.util.*;

class Platform {

	String name = null;
	int foundYear = 0;

	Platform(String name,int foundYear) {

		this.name = name;
		this.foundYear = foundYear;
	}

	public String toString() {
	
		return "{" + name + " : " + foundYear + "}";
	}
}
class SortByName implements Comparator{

	public int compare(Object obj1,Object obj2) {

		return (((Platform)obj1).name.compareTo(((Platform)obj2).name));
	}
}
class TreeMapDemo {

	public static void main(String [] args) {
	
		TreeMap tm = new TreeMap(new SortByName());

		tm.put(new Platform("youtube",2005),"Google");
		tm.put(new Platform("Instagram",2013),"Meta");
		tm.put(new Platform("ChatGpt",2022),"OpenAI");
		tm.put(new Platform("twitter",2008),"Tesla");

		System.out.println(tm);
	}
}
