import java.util.*;
class ArrayListDemo {

	public static void main(String [] args){
	
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

	//	System.out.println(al);

		for(var data: al){

			System.out.println(data);
		}
			
		System.out.println("Linked List");

		LinkedList ll = new LinkedList();

		ll.add(10);
		ll.addLast(20);
		ll.add(30);
		ll.addLast(40);
		ll.add(50);
		ll.addLast(60);
		
		for(var data: ll){

			System.out.println(data);
		}
	}
}
