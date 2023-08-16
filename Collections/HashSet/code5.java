import java.util.*;
class CricPlayer implements Comparable<CricPlayer>{

	int jerNo = 0;
	String pName = null;
	CricPlayer(int jerNo,String pName){

		this.jerNo = jerNo;
		this.pName = pName;
	}

	public String toString(){
	
		return jerNo +":" +pName;
	}

	@Override
	public int compareTo(CricPlayer obj){

		if(this.jerNo != obj.jerNo){
			System.out.println("PN-1");
			return 1;
		}
		if(((obj.pName).equals(this.pName)) == false){
			System.out.println("PN-2");
			return 1;
		}
		System.out.println("PN");
		return 0; 
	}
}
class HashSetDemo {

	public static void main(String [] args) {
	
		LinkedHashSet hs = new LinkedHashSet();

		hs.add(new CricPlayer(7,"MSDhoni"));
		hs.add(new CricPlayer(18,"Virat"));
		hs.add(new CricPlayer(45,"Rohit Sharma"));
		hs.add(new CricPlayer(7,"MSDhoni"));
		hs.add(new CricPlayer(69,"Jeet"));

		System.out.println(hs);
	}
}
