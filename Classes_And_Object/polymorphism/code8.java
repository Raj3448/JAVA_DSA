//when the parent refrence and child object during that time we can call only that methods which are having parent class 
//Because when we call an method over the object the methods must be available in parent class for compile time/early binding either we getting an error like cannot find symbol
class Parent{

	Parent(){
	
		System.out.println("Parent Constructor");
	}
	void fun(){
	
		System.out.println("In Parent fun");
	}
}
class Child extends Parent{

	Child(){
	
		System.out.println("In Child Constructor");
	}
	void fun(){
	
		System.out.println("In Child Fun");
	}
	void gun(){
	
		System.out.println("In Child Gun");
	}
}
class Client{

	public static void main(String[]args) {
	
		Parent obj = new Child();
		obj.gun();;
	}
}
