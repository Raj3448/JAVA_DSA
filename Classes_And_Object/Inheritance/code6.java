class Parent{

	int x = 10;
	int y = 20;
	static int z = 30;
	protected int r = 40;
	Parent(){
	
		System.out.println("In Parent Constructor");
	}
	void info(){
	
		System.out.println("In Private Property of parent");
	}
}
class Child extends Parent{

	int x = 50;
	int y = 60;
	int z = 70;

	Child(){

		System.out.println("In CHild Constructor");
	}
	void accessData(){
	
		System.out.println(super.x);
		System.out.println(super.y);
		System.out.println(super.z);
		System.out.println(r);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
class Client{

	public static void main(String [] args){
	
		Child obj = new Child();
		obj.accessData();
		obj.info();
	}
}
