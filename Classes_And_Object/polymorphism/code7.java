//Overriding scenario in two different class which having parent child relation 
class Parent{

	Parent(){
	
		System.out.println("In Parent Constructor");
	}
	void property(){
	
		System.out.println("Gold,Home,estate");
	}
	void marry(){
	
		System.out.println("Alia Bhat");
	}
}
class Child extends Parent{

	Child(){
	
		System.out.println("In Child Constructor");
	}
	void marry(){
	
		System.out.println("Disha Patni");
	}
}
class Client{

	public static void main(String [] args){
	
		Parent obj1 = new Parent();
		obj1.property();
		obj1.marry();

		Child obj2 = new Child();
		obj2.property();
		obj2.marry();
		
		Parent obj3 = new Child();
		obj3.property();
		obj3.marry();
	}
}
