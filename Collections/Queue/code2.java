import java.util.*;

class DequeueDemo {

	public static void main(String [] args) {
	
		Deque dq = new LinkedList();
		dq.offer(40);
		dq.offer(30);
		dq.offer(20);
		dq.offer(10);
		
		System.out.println(dq);

		dq.offerFirst(50);
		dq.offerLast(2000);
		System.out.println(dq);
		
		dq.pollFirst();
		dq.pollLast();
		System.out.println(dq);
	
		Iterator itr = dq.iterator();

		while(itr.hasNext()) {

			System.out.println(itr.next());
		}

		itr = dq.descendingIterator();
		
		System.out.println("-------------");

		while(itr.hasNext()) {

			System.out.println(itr.next());
		}

	}
}
