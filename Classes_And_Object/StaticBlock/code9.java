//first all static variables initializing in the static block
//then execute static block instructions
//then main method invokes
class StaticDemo{

	int x = 10;
	static int y = 20;

	static {
	
		System.out.println("In Static block 1");
	}

	public static void main(String[]args){
	
		StaticDemo obj = new StaticDemo();

		System.out.println(obj.x);
		System.out.println(y);
	}

	static {
	
		System.out.println("In Static block 2");
	}
}
