import java.util.*;
class Movies implements Comparable{

	String movieName = null;
	double totColl = 0.0;
	float imdbRate = 0.0f;

	Movies(String movieName, double totColl,float imdbRate){
	
		this.movieName = movieName;
		this.totColl = totColl;
		this.imdbRate = imdbRate;
	}

	public int compareTo(Object obj){
	
		return movieName.compareTo((((Movies)obj).movieName));
	}

	public String toString(){
	
		return "{" + movieName + ":" + totColl + ":" + imdbRate +  "}";
	}
}
class TreeSetDemo {

	public static void main(String [] args) {
	
		TreeSet ts = new TreeSet();

		ts.add(new Movies("Mahabharat",3784,9.9f));
		ts.add(new Movies("Kantara",9884,8.7f));
		ts.add(new Movies("Rowdy",6784,5.6f));
		ts.add(new Movies("Systumm",7884,7.9f));

		System.out.println(ts);
	}
}
