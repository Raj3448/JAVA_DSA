class Outer{

	class Inner{
	
		void fun(){
		
			System.out.println("Innner fun");
		}
	}
}
class Client{

	public static void main(String[] args){
	
		Outer.Inner obj = new Outer().new Inner();
		obj.fun();
	}
}
