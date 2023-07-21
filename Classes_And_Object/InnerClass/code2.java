class Outer{

	class Inner{
	
		void fun1(){
		
			System.out.println("In Inner fun");
		}
	}

	void fun1(){
	
		System.out.println("In Outer fun");
	}
}
class Client{

	public static void main(String [] args){
	
		Outer obj = new Outer();
		obj.fun1();
		Outer.Inner obj1 = obj.new Inner();
		obj1.fun1();
	}
}
