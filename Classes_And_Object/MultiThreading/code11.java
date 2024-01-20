class MyThread extends Thread {

	MyThread(String name) {

		super(name);
	}
	public void run() {

		System.out.println("In run:"+Thread.currentThread().getName());
	}
}
class Client {

	public static void main(String [] args) {

		MyThread obj1 = new MyThread("C2w");
		MyThread obj2 = new MyThread("Incubator");

		obj1.start();
		obj2.start();

		System.out.println("In main:"+Thread.currentThread().getName());

	}
}
