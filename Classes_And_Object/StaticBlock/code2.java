class Demo{

	int x = 10;
	static int y = 20;

	Demo(){
	
		System.out.println("In Constructor");
	}
	static {
	
		System.out.println("Static block1");
	}

	public static void main(String [] args){
	
		System.out.println("Main Method");
		Demo obj = new Demo();
		System.out.println("main end");
	}
	static{
	
		System.out.println("Static block2");
		System.out.println(y);
	}
}
