//Modifier in overriding
//1.Final -> when method is final then it overriding in child class but it can accessiable to child class
//2.Static
class Parent{

	final void fun(){
	
		System.out.println("In parent fun");
	}
	static void gun(){
	
		System.out.println("In Static gun parent");
	}
}
class Child extends Parent{

	/*void fun(){
	
		System.out.println("In Child Fun");
	}*/
	static void gun(){
	
		System.out.println("In Static gunchild");	//Method Hiding concet
	}
	public static void main(String[]args) {
	
		Child obj = new Child();
		obj.fun();
		Parent.gun();
		obj.gun();
	}
}
