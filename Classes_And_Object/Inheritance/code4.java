//static in parent class
class Parent{

	Parent(){
	
		System.out.println("In Parent Constructor");
	}
	static{
	
		System.out.println("In Parent satatic Block1");
	}
}
class Child extends Parent{

	Child(){

		System.out.println("In Child Constructor");
	}
	static{
	
		System.out.println("In Child Static Block");
	}
}
class Client{

	public static void main(String [] args){
	
		Child obj = new Child();
	}
}
