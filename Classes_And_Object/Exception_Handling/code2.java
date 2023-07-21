class Demo{

	void m1(){
	
		System.out.println("In m1");

		try{
			System.out.println(10/0);
		}catch(ArithmeticException obj){
			
			System.out.println(obj);
			obj.printStackTrace();	
		}
	}
	void m2(){
	
		System.out.println("In m2");
		m1();
	}
	public static void main(String []args){
	
		System.out.println("Start main");
		Demo obj = new Demo();
		obj.m2();
	}
}
