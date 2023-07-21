class MyThread extends Thread{

	public void run(){
	
		Thread obj = Thread.currentThread();
		System.out.println(obj.getPriority);
	}
}
class Demo{

	public static void main(String [] args){
	
		MyThread obj = new MyThread();

		obj.start();
	}
}
