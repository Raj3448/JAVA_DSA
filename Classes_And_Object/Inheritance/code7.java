class Parent{

	int x = 10;
	static int y = 20;

	Parent(){
	
		System.out.println("Parent");
	}

	void fun(){
	
		System.out.println("In fun");
	}
	static void run(){
	
		System.out.println("In static run");
	}

}
class Child extends Parent{

	void gun(){
	
		System.out.println("In gun");
	}
}
class Client{
	
	public static void main(String[]args){
	
		Child obj = new Child();
		Parent obj1 = new Parent();
		 
		System.out.println(obj.x);
		System.out.println(obj.y);
		obj.fun();
		obj.run();
		obj.gun();
	}

}
