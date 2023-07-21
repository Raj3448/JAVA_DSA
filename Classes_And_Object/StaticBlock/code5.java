class Demo{

	int x = 10;
	Demo(){
	
		System.out.println("In Demo Constructor");
	}
	{
	
		System.out.println("In Instance block 1");
	}
	public static void main(String [] args){
	
		Demo obj = new Demo();
		System.out.println("In main");
	}
	static {
	
		System.out.println("In static block1");
	}
	{
	
		System.out.println("In Instance block2");
	}
}
