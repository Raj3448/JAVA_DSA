//BlockingQueue on apply on producer/consumer 
import java.util.concurrent.*;

class Producers implements Runnable{

	BlockingQueue bq = null;
	Producers(BlockingQueue bq) {

		this.bq = bq;
	}

	public void run() {
	
		for(int i=1;i<=10;i++){

			System.out.println("Producer: "+i);
			try{
				bq.put(i);
				Thread.sleep(10000);
			}catch(InterruptedException ie){

			}
		}
	}
}
class Consumers implements Runnable{
	
	BlockingQueue bq;
	Consumers(BlockingQueue bq){

		this.bq = bq;
	}

	public void run() {
	
		for(int i=1;i<=10;i++) {

			System.out.println("Consumer: "+i);
			try{
				bq.take();
				//Thread.sleep(15000);
			}catch(InterruptedException ie){

			}

		}
	}

}
class PQDemo {

	public static void main(String [] args) {

		BlockingQueue bq = new ArrayBlockingQueue(3);
		
		Producers produce = new Producers(bq);
		Consumers consume = new Consumers(bq);

		Thread producerThread = new Thread(produce);
		Thread consumerThread = new Thread(consume);

		producerThread.start();
		consumerThread.start();
	}
}
