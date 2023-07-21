class Mythread implements Runnable{

	public void run(){

		System.out.println(Thread.currentThread().getName()+": In run");
	}
}
class Demo {

	public static void main(String [] args){

		Mythread obj = new Mythread();
		Thread t = new Thread(obj);
		t.start();
	 	
		System.out.println(Thread.currentThread().getName()+": In main");	
	}
}
