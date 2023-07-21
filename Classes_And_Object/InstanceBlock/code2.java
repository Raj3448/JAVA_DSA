class InstanceDemo{

	InstanceDemo(){
	
		System.out.println("In constructor");
	}
	static {
	
		System.out.println("In static Block 1");
	}
	{
	
		System.out.println("In Instance Block 1");
	}
	public static void main(String[] args){
	
		InstanceDemo obj = new InstanceDemo();

	}
	static {
	
		System.out.println("In static Block 2");
	}

	{
		System.out.println("In Instance Block 2");
	}
}
