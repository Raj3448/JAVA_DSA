//In overriding scenario must having same method signature and premeative return type and one more another overiding scenario support same method
//signature but covarient return type that means return types are classes which having parent child relation
class Parent{

	Parent(){
	
		System.out.println("In parent constructor");
	}
	void fun(){
	
		System.out.println("In parent fun");
	}
	Object gun(){
	
		System.out.println("In parent fun");
		return new Object();
	}
}
class Child extends Parent{


	Child(){
	
		System.out.println("In child constructor");
	}
	void fun(){						//must having same return type 
	
		System.out.println("In Child fun");
		//return 10;
	}
	String gun(){						//its allow covarient return type which classes having parent child relation
	
		System.out.println("In parent fun");
		return new String();
	}
}
class Client {

	public static void main(String []args) {
	
		Parent obj = new Child();
		obj.fun();
	}
}
