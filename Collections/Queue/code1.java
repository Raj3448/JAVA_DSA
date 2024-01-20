import java.util.*;

class QueueDemo {

	public static void main(String [] args) {
	
		Queue que = new LinkedList();

		que.offer(10);
		que.offer(30);
		que.offer(20);
		que.offer(50);
		que.offer(30);
		que.offer(40);

		//System.out.println(que.getFirst());

		System.out.println(que.poll());
		System.out.println(que.remove()); //Exception

		System.out.println(que);
		System.out.println(que.peek());
		System.out.println(que.element());//Exception		
	}
}
