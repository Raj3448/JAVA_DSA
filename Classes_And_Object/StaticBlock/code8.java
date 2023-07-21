class StaticDemo{

	int x = 10;
	static int y = 20;

	void fun1(){
	
		System.out.println(x);
		System.out.println(y);
	}
	static void fun2(){
	
		System.out.println(y);
	}
}
class Client{

	public static void main(String []args){
		
		StaticDemo obj = new StaticDemo();

		obj.fun1();
		obj.fun2();

		StaticDemo.fun2();
	}
}
//output :
//10
//20
//20
//20
