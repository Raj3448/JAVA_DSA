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
	
		System.out.println("Child Constructor");
	}
	void run(){
	
		System.out.println("In Child fun");
	}
}
class Client{

	public static void main(String [] args){
	
		Parent obj = new Child();
		obj.fun();
	}
}
