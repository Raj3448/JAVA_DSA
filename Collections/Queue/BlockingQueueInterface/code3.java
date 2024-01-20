import java.util.concurrent.*;
class BDemo {

	public static void main(String [] args) {

		BlockingQueue bq = new LinkedBlockingQueue();

		bq.offer(60);
		bq.offer(10);
		bq.offer(20);
		bq.offer(30);
		bq.offer(40);


	}
}
