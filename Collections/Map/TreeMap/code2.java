import java.util.*;
class Platform implements Comparable{

	String compName = null;
	int inveYear = 0;

	Platform(String compName,int year) {

		this.compName = compName;
		this.inveYear = inveYear;
	}

	public String toString() {
	
		return "{" + compName + ":" + inveYear + "}";
	}

	public int compareTo(Object obj) {
	
		return compName.compareTo(((Platform)obj).compName);
	}
}
class TreeMapDemo {

	public static void main(String [] args) {
	
		TreeMap tm = new TreeMap();

		tm.put(new Platform("youtube",2005),"Google");
		tm.put(new Platform("Instagram",2013),"Meta");
		tm.put(new Platform("ChatGpt",2022),"OpenAI");
		tm.put(new Platform("Twitter",2006),"Tesla");
		tm.put(new Platform("Facebook",2008),"Meta");

		System.out.println(tm);
	}
}
