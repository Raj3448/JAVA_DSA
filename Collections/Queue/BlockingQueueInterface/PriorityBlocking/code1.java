import java.util.concurrent.*;
class PQDeom {

	public static void main(String [] args)throws InterruptedException{
	
		BlockingQueue bq = new PriorityBlockingQueue(3);

		/*bq.offer(50);
		bq.offer(10);
		bq.offer(20);
		bq.offer(30);
		bq.offer(40);
		*/
		bq.put(50);
		bq.put(10);
		bq.put(20);
		bq.put(30);
		bq.put(40);


		System.out.println(bq);

	}
}
