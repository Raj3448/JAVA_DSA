//Static elements
class Parent{

	static int x = 10;

	Parent(){
	
		System.out.println("In Parent Constructor");
	}
	static void accessData(){

		System.out.println(x);	
	}
	static{
	
		System.out.println("In Parent Static Block ");

	}
}
class Child extends Parent{

	static {
	
		System.out.println("In Child Static Block");
		accessData();
		System.out.println(x);
	}
	Child(){
	
		System.out.println("In Child Constructor");
	}
}
class Client{

	public static void main(String [] args){
	
		Child obj = new Child();
	}
}
