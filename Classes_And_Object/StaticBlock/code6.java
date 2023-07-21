class Demo{

	static {
	
		System.out.println("In static Block1");
	}
	{
	
		System.out.println("In Instance Block2");
	}
	public static void main(String []args){
	
		Demo obj = new Demo();
	}
	static {
	
		System.out.println("In static Block2");
	}
	
		System.out.println("In Instance Block1");
	}
}
