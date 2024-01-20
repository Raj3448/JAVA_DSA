import java.util.concurrent.*;
import java.util.*;

class BlockingQDemo {

	public static void main(String [] args) {

		BlockingQueue bq = new LinkedBlockingQueue();

		bq.offer(50);
		bq.offer(10);
		bq.offer(20);
		bq.offer(30);
		bq.offer(40);

		System.out.println("LBQ: "+bq);

		HashSet hs = new HashSet();

		bq.drainTo(hs);

		System.out.println("HashSet: "+hs);
		System.out.println("LinkedBlockingQueue: "+bq);
	}
}
