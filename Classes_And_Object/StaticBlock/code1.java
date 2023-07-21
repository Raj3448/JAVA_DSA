class Demo{

	static void fun(){
	
		System.out.println("In fun");
	}
	public static void main(String [] args){
	
		System.out.println("In main");

	}
	static {
	
		System.out.println("In static");
		fun();
	}
}
