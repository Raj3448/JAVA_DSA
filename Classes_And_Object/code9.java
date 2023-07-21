class Demo{

	int = 10;
	private int y = 20;
	static int z = 30;
	void disp(){
		 
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
class Client{

		static int x = 10;
	public static void main(String []args){

		//static int x = 10;
		//System.out.println(x);
	
		Demo obj1 = new Demo();
		Demo obj2 = new Demo();

		obj1.disp();
		obj2.disp();

		System.out.println("___________________________________");
		System.out.println("___________________________________");
		
		obj1.x = 45;
		obj2.x = 56;

		obj1.disp();
		obj2.disp();

		System.out.println("___________________________________");
		System.out.println("___________________________________");

		Demo.z = 300;

		obj1.disp();
		obj2.disp();
	}
}
