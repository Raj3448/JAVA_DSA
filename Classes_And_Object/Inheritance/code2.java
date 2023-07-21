class Parent{

	Parent(){
	
		System.out.println("In Parent Constructor");
	}

	void ParentProperty(){
	
		System.out.println("Car, Bike, Money, Gold");
	}
}
class Child extends Parent{

	Child(){
	
		System.out.println("In child Constructor");
	}
}
class Client{

	public static void main(String[]args){
	
		Child obj = new Child();
		obj.ParentProperty();
	}
}
