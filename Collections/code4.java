import java.util.*;
class LinkedListDemo{

	public static void main(String [] args) {
	
		LinkedList ll = new LinkedList();
		
		ll.add(10);
		ll.add(20);
		ll.add(30);

		LinkedList ll1 = new LinkedList();

		ll1.addAll(ll);

		System.out.println(Thread.currentThread());
		System.out.println(ll1);

	}
}
