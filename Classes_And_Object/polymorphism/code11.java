//Overloading scenario important for interview preapration
class Demo{

	void fun(String str1) {
	
		System.out.println("String para");
	}
	void fun(StringBuffer str1) {
	
		System.out.println("StringBuffer para");
	}
}
class Client{

	public static void main(String []rags) {
	
		Demo obj = new Demo();
		obj.fun("Rajkumar");
		obj.fun(new StringBuffer("Rajkumar"));

		//obj.fun(null); //Error -> Ambiguous
	}
}
