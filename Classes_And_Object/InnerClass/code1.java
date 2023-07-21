class Outer{

	class Inner{
	
		void fun(){
		
			System.out.println("In Inner fun");
		}
	}

	void fun1(){
	
		System.out.println("In Outer Fun");
	}
}
class Client{

	public static void main(String [] args){
	
		Outer obj1 = new Outer();
		obj1.fun1();

		
		Outer.Inner obj2 = obj1.new Inner();
		obj2.fun();
	}
}
