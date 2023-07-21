class InstanceDemo{

	int x = 10;

	InstanceDemo(){
	
		System.out.println("In construtor");
	}
	{
	
		System.out.println("In Instance");
	}
	public static void main(String[]rags){
	
		InstanceDemo obj = new InstanceDemo();
		System.out.println("In main");
	}
}
