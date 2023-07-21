//when we create an object of class at first time only,
//then invokes the static block of that class,
//before invokes the constructor
class StaticDemo{

	static{
	
		System.out.println("In Static Block 1");
	}
	StaticDemo(){
	
		System.out.println("In Constructor");
	}
	public static void main(String [] args){
	
		System.out.println("In StaticDemo main");
	}
}
class Client{

	static{
	
		StaticDemo obj = new StaticDemo();
		System.out.println("In static block 2");
	}
	public static void main(String[] args){
	
		StaticDemo obj = new StaticDemo();
		System.out.println("In Client main");
	}
	static{
	
		System.out.println("In static 3");
	}
}
