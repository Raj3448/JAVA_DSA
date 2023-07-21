class Outer{

	class Inner{
	
		Inner(){
			
			System.out.println(this);
			System.out.println(this$0);
		}
	}
		void fun1(){
			
			System.out.println(this);
		}
}
