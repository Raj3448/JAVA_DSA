import java.util.*;

class CrickPlayer {

	int jerNo = 0;
	String name = null;
	
	CrickPlayer(int jerNo, String name){

		this.jerNo = jerNo;
		this.name = name;
	}

	public String toString(){

		return jerNo + " : " + name; 
	}
}

class ArrayListDemo {

	public static void main(String [] args){
		
		ArrayList al = new ArrayList();

		al.add(new CrickPlayer(7,"MSD"));
		al.add(new CrickPlayer(18,"Virat"));
		al.add(new CrickPlayer(45,"Rohit"));

		al.add(20);
		al.add(2,"Hardik");
		al.add(3,new CrickPlayer(33,"Hardik"));

		System.out.println(al);        //Internaly call invokes along with toString() method;
	}
}
