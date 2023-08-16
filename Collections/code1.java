//ArrayList
import java.util.*;
class ArrayListDemo extends ArrayList{

	public static void main(String [] args) {
	
		ArrayListDemo al = new ArrayListDemo();
		al.add(10);
		al.add(20.3f);
		al.add(43.2);
		al.add("Rajkumar");
		al.add(10);

		System.out.println(al.size());

		System.out.println("Contains Object of(Rajkumar):"+al.contains("Rajkumar"));

		System.out.println("Index of Rajkumar:"+al.indexOf("Rajkumr"));

		System.out.println(al);
		
		System.out.println(al.lastIndexOf(10));

		System.out.println(al.get(3));
		
		System.out.println("Set Object in Arraylist:"+al.set(3,"Core2web"));

		ArrayList obj = new ArrayList();
		obj.add(150);
		obj.add(160);
		obj.add(170);
		obj.add("Incubator");
		al.addAll(obj);
		System.out.println(al);
		al.addAll(3,obj);

		System.out.println(al);
		al.removeRange(3,5);

		System.out.println(al.remove(4));

		Object arr[] = al.toArray();

		for(Object data: arr){

			System.out.println(data);
		}
		
		System.out.println(al);

		al.clear();

		System.out.println(al);
	}
}
