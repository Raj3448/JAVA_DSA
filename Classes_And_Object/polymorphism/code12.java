//Overloading scenario imp for interview
class Demo{

	void fun(Object obj) {
	
		System.out.println("Object");
	}
	void fun(String str1) {
	
		System.out.println("String para");
	}

	public static void main(String [] rags) {
	
		Demo obj = new Demo();
		
		obj.fun("Rajkumar"); //Found Exact Match -> String para

		obj.fun(new StringBuffer("Rajkumar")); // Exact Match Not Found -> reach parent -> object

		obj.fun(null); //Both matching -> But getting priority to the Child because parent child relation  -> String
	}
}
//String para
//object
//String para
