//Multiple Interface suppoting in java
interface Demo1{

	void fun();
}
interface Demo2{

	void fun();
}
class Child implements Demo1,Demo2{

	public void fun(){
	
		System.out.println("In Child Fun");
	}
}
class Client{

	public static void main(String [] args) {
	
		Child obj = new Child();
		obj.fun();
		Demo1 obj1 = new Child();
		obj1.fun();
		Demo2 obj2 = new Child();
		obj2.fun();
	}
}
