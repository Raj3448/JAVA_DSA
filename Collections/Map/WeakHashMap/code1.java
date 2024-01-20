class Demo {

	String str = null;

	Demo(String str){

		this.str = str;
	}
	
	public String toString() {
	
		return str;
	}

	public void finalize() {
	
		System.out.println("Notify");
		System.out.println("finalize:"+Thread.currentThread());
	}

}
class GarbadgeCollectorDemo {

	public static void main(String [] args) {
	
		Demo obj1 = new Demo("Core2web");
		Demo obj2 = new Demo("Biencaps");
		Demo obj3 = new Demo("Incubator");
		Demo obj4 = new Demo("Apple");

		System.out.println("Main:"+Thread.currentThread());

		obj1 = null;
		obj2 = null;
		obj3 = null;
		obj4 = null;

		System.gc();

		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
	}
}
