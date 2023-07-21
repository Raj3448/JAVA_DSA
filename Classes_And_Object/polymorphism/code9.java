class Parent{

	void fun(){
	
		System.out.println("In Parent fun");
	}
}
class Child extends Parent{

	void fun(int x){
	
		System.out.println("In Child para - fun");
	}
	void fun(){
	
		System.out.println("In Child fun");
	}
}
class Client{

	public static void main(String[]args){
	
		Parent obj = new Child();
		obj.fun();
	}
}
