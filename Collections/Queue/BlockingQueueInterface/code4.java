import java.util.concurrent.*;

class PriorityBQDemo {

	public static void main(String [] args) {
	
		BlockingQueue bq = new PriorityBlockingQueue(3);

		bq.offer(40);

		bq.offer(10);
		bq.offer(30);
		System.out.println(bq.size());
		System.out.println(bq.remainingCapacity());
		bq.offer(50);
		bq.offer(20);
		bq.offer(60);
		bq.offer(60);
		System.out.println(bq.size());
		System.out.println(bq.remainingCapacity());

		System.out.println(bq);
	}
}
