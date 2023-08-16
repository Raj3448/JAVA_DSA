import java.util.*;
class Movies {

	String moviName = null;
	double totColl = 0.0;
	float imdbRate = 0.0f;

	Movies(String moviName, double totColl,float imdbRate){

		this.moviName = moviName;
		this.totColl = totColl;
		this.imdbRate = imdbRate;
	}

	public String toString(){
	
		return "{" + moviName + ":" + totColl + ":" + imdbRate + "}";
	}
}
class SortByMoviName implements Comparator{

	public int compare(Object obj1,Object obj2){
	
		return (((Movies)obj1).moviName.compareTo(((Movies)obj2).moviName));
	}
}
class SortByTotColl implements Comparator {

	public int compare (Object obj1, Object obj2) {
	
		return (int)(((Movies)obj1).totColl + ((Movies)obj2).totColl);
	}
}
class SortByImdbRate implements Comparator {

	public int compare (Object obj1,Object obj2){

		return (int)(((Movies)obj1).imdbRate + ((Movies)obj2).imdbRate);
	}
}
class ListSortDemo {

	public static void main(String [] args) {
	
		ArrayList al = new ArrayList();

		al.add(new Movies("kantara",863275.34,8.9f));
		al.add(new Movies("omg2",8723275.34,6.9f));
		al.add(new Movies("gadar2",563275.34,8.6f));
		al.add(new Movies("dabang",963275.34,9.4f));
		al.add(new Movies("fork",463275.34,7.4f));
		al.add(new Movies("krish1",463275.34,6.4f));
		al.add(new Movies("holiday",463275.34,9.4f));

		System.out.println(al);

		System.out.print("Sort By Movie Name:");
		Collections.sort(al,new SortByMoviName());

		System.out.println(al);
		
		System.out.print("Sort By Movie Total Collection:");
		Collections.sort(al,new SortByTotColl());

		System.out.println(al);
		
		System.out.print("Sort By Movie ImdbRate:");
		Collections.sort(al,new SortByImdbRate());

		System.out.println(al);
	}
}
