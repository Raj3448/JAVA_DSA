class Demo{

	void m1(){
	
		System.out.println("In m1");
	}
	void m2(){

		System.out.println("In m2");
		Demo obj = new Demo();
		obj = null;
		obj.m1();
	}
	public static void main(String [] args) {
	
		System.out.println("Start main");
		Demo obj = new Demo();
		try{
			obj.m2();
		}catch(NullPointerException obj1){
			
			System.out.println("pointer null ahe check kar lavdya");
		}
		System.out.println("End main");
	}
}
