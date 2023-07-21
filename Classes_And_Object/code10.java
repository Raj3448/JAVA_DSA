class Demo{

	int x = 20;
	
	Demo(int x){
	
		this.x = x;
		System.out.println(this.x);
	}
	{
	
		System.out.println("In Instance Block "+x);
	}
	public static void main(String[] args){
	
		int x = 10;
		Demo obj = new Demo(x);

		System.out.println(obj.x);
	}
} 
