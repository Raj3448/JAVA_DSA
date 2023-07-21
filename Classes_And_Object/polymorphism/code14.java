//Access Specifier in overriding
class Parent{

	private void fun(){

		System.out.println("In Parent fun");
	}

}
class Child extends Parent{

     	/*void fun(){
	
		System.out.println("In Child Fun");
	}*/
	public static void main(String [] args) {
	
		Child obj = new Child();
		obj.fun();
	}
}
