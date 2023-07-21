interface Demo{

	void fun();
	void gun();
}
abstract class DemoChild implements Demo{

	public void fun(){
	
		System.out.println("In Demochild fun");
	}
}
class Child extends DemoChild{

	public void gun(){
	
		System.out.println("In Child gun");
	}
}
class Client{

	public static void main(String[] args) {
	
		Child obj = new Child();
		obj.fun();
		obj.gun();
	} 
}
