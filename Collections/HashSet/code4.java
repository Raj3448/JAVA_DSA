//HashSet of user defined class
import java.util.*;
class CricPlayer {

	int jerNo;
	String pName = null;

	CricPlayer(int jerNo,String pName){

		this.jerNo = jerNo;
		this.pName = pName;
	}

	public String toString(){

		return jerNo + ":" + pName;
	}
}
class HashSetDemo {

	public static void main(String [] args) {
	
		HashSet hs = new HashSet();

		hs.add(new CricPlayer(7,"MSDhoni"));
		hs.add(new CricPlayer(18,"Virat"));
		hs.add(new CricPlayer(45,"Rohit"));
		hs.add(new CricPlayer(7,"MSDhoni"));

		System.out.println(hs);
	}
}
