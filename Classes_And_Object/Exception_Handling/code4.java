class Client{

	void m1(){
	
		System.out.println("In Client m1");
		Client obj = new Client();
		//obj = null;
		try{
			obj.m1();
			throw new Exception("Object Null zala ahe");
		}catch(Exception obj1){
		
			System.out.println(obj1);
		}
	}
	void m2(){
	
		System.out.println("IN Client m2");
		m1();
	}
	void m3(){
	
		System.out.println("IN Client m3");
	}
}
class Demo{

	void m1(){
	
		System.out.println("In m1");
		Client obj = new Client();
		obj.m2();
	}
	void m2(){
	
		System.out.println("IN M2");
		m1();
	}
	
	public static void main(String[]args) {
	
		System.out.println("Start Main");
		Demo obj = new Demo();
		obj.m2();
		System.out.println("End Main");
	}
}
