//Anonymous inner class
import java.util.*;
class ServerThread {

public static void main(String [] args){
	Runnable obj1 = new Runnable(){

		public void run(){
		
			System.out.println(Thread.currentThread().getName());
		}
	};
	Runnable obj2 = new Runnable(){
	
		public void run(){
		
			System.out.println(Thread.currentThread().getName());
		}
	};
	
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		t2.start();

	}
}
/*
class Client {

	public static void main(String [] args) {
	
		Thread t1 = new Thread();
		Thread t2 = new Thread();

		t1.start();
		t2.start();
	}
}*/
