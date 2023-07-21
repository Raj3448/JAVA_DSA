class Demo{

	int x = 10;
	Demo(){
		
		System.out.println("Start Constructor");
		System.out.println(this);
		System.out.println(this.x);
		System.out.println("End Constructor");
	}

	{
		System.out.println("Instance Block");
	}

	public static void main(String [] args){
	
		Demo obj = new Demo();

		System.out.println(obj);
		System.out.println(obj.x);
	}
}
