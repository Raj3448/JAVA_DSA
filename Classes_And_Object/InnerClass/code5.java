class Outer{

	static class Inner{
	
		void fun(){
		
			System.out.println("In taic nner fun");
		}
	}
}
class Client{

	public static void main(String [] args){
	
		Outer.Inner obj = new Outer.Inner();
		obj.fun();
	}
}
