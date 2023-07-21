class Demo{

	static {
	
		System.out.println("In Static block 1");
	}

	public static void main(String [] args){
	
		System.out.println("In Main Demo");
	}
}
class Client{

	static {
	
		System.out.println("In Static Block 2");
	}
	public static void main(String[]args){
	
		System.out.println("In Main Client");
		Demo obj = new Demo();
		System.out.println("In Main Client End");
	}
	static {
	
		System.out.println("In static block 3");
	}
}
