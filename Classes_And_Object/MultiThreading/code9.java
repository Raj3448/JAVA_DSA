class MyThread extends Thread {
    
	public void run() {
        	Thread t = Thread.currentThread();
        	System.out.println(t.getName() + " = " + t.getPriority());
    	}
}

class ThreadDemo {
    	
	public static void main(String[] args) {
        	
		Thread obj = Thread.currentThread();
        	System.out.println(obj.getName() + " = " + obj.getPriority());

        	MyThread obj1 = new MyThread();
        	obj1.start();

        	MyThread obj2 = new MyThread();
        	obj2.start();
    }
}

