import java.util.concurrent.*;
class BlockingQDemo {

	public static void main(String [] args)throws InterruptedException{
	
	

		BlockingQueue bq = new ArrayBlockingQueue(6);

		bq.offer(50);
		bq.offer(40);
		bq.offer(10);
		bq.offer(20);
		System.out.println(bq);
		bq.offer(30,3,TimeUnit.SECONDS);
		System.out.println(bq);

		System.out.println(bq.poll());
		System.out.println(bq.take());

		System.out.println(bq);
		bq.offer(60);
		bq.offer(70);

		System.out.println(bq.poll(4,TimeUnit.SECONDS));
		bq.offer(60);
		System.out.println(bq);
		System.out.println(bq.peek());
		System.out.println(bq.size());
		System.out.println(bq.remainingCapacity());
		System.out.println(bq.remove(70));
		System.out.println(bq);
		System.out.println(bq.contains(60));
		
	        Object obj[] = bq.toArray();
		
		System.out.println(obj);

	}
}
