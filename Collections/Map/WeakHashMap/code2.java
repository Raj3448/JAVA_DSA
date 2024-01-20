import java.util.*;

class Demo {

	String str =  null;
	Demo(String str) {
	
		this.str = str;
	}

	public String toString() {
		
		return str;
	}

	public void finalize() {
	
		System.out.println("Notify");
	}

}

class WeakHashMapDemo {

	public static void main(String [] arrgs)throws InterruptedException{

		Demo obj1 = new Demo("Core2web");
		Demo obj2 = new Demo("Biencaps");
		Demo obj3 = new Demo("Incubator");
		Demo obj4 = new Demo("Apple");
		Demo obj5 = new Demo("LG");
		Demo obj6 = new Demo("Sony");
		
		obj1 = null;
		obj2 = null;
		obj3 = null;
		obj4 = null;
		
		System.gc();
	
		HashMap hm1 = new HashMap();

		hm1.put(obj1,"2016");
		hm1.put(obj2,"2019");
		hm1.put(obj3,"2023");
		hm1.put(obj4,"2025");
		hm1.put(obj5,"2027");
		hm1.put(obj6,"2028");

		//Thread.sleep(4000);
		
		System.out.println(hm1);

		System.out.println("--------------------------------------------------");
		

		/*WeakHashMap whm1 = new WeakHashMap();

		whm1.put(obj1,"2016");
		whm1.put(obj2,"2019");
		whm1.put(obj3,"2023");
		whm1.put(obj4,"2025");
		whm1.put(obj5,"2026");
		whm1.put(obj6,"2027");

		Thread.sleep(2000);

		System.out.println(whm1);*/

	}
}
