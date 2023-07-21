class MyThread extends Thread{

	public void run(){
	
		try{
			Thread.sleep(1000);
		}catch(InterruptedException obj){
	
		}
		System.out.println("In run");
		System.out.println("In run");
	}

	

}
class Client{

	public static void main(String [] args){
	
		MyThread obj = new MyThread();
		obj.start();
		
		System.out.println("In main");
	}
}
