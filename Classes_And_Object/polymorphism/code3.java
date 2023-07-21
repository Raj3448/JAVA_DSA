class Parent{

	/*Object fun(){
	
		System.out.println("In Parent Fun");

		return new Object();
	}*/
	String fun(){
	
		System.out.println("In Child fun");
		
		return "Shashi Sir Legend";
	}
}
class Child extends Parent{

	/*String fun(){
	
		System.out.println("In Child fun");
		
		return "Shashi Sir Legend";
	}*/
	Object fun(){
	
		System.out.println("In Parent Fun");

		return new Object();
	}
}
class Client{

	public static void main(String [] args){
	
		Parent p = new Child();
		p.fun();
	}
}
