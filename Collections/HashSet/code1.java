import java.util.*;
class HashSetDemo {

	public static void main(String [] args){
	
		HashSet hs = new HashSet();
		
		System.out.println(hs.add(10));
		System.out.println(hs.add(20));
		System.out.println(hs.add(30));
		System.out.println(hs.add(40));
		System.out.println(hs.add(10));
		System.out.println(hs.add(20));
		
		System.out.println(hs);

		HashSet hs1 = new HashSet();

		hs1.clone();

		for(var data:hs1){

			System.out.println(data);
		}
	}
}
