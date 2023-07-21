class Outer{

	int a = 10;
	static int b = 20;
	
	static class Inner{

		int x = 10;
		static int y = 20;

		void fun(){
			
			System.out.println(x);
			System.out.println(y);
		}
	}
}
class Client{

	public static void main(String [] args){

		Outer obj = new Outer();		
		Outer.Inner obj1 = obj.new Inner();
	}
}
