abstract class Parent {

	void property(){
	
		System.out.println("Bike,money,gold,cars");
	}
	abstract void marry();
}
class Child extends Parent{

	void marry(){
	
		System.out.println("Disha patni");
	}
}
class Client{

	public static void main(String[] args){
	
		Parent obj = new Child();
	}
}
