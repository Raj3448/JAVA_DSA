class Demo extends Thread{

	public void run(){
	
		System.out.print(Thread.currentThread().getName()+": ");
		System.out.println("In run");
	}
} 
class MyThread extends Thread{

	public void run(){
	
		Demo obj = new Demo();
		obj.start();
		System.out.print(Thread.currentThread().getName() + ": ");
		System.out.println("In run");

		//obj.start();
	}
}
class Client{

	public static void main(String [] args){
	
		MyThread obj = new MyThread();
		obj.start();
		
		System.out.print(Thread.currentThread().getName() + ": ");
		System.out.println("In run");

	}
}
