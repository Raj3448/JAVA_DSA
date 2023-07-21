
//In this code we access the static variable by using the Class name
class StaticBlock{

	static int x = 10;
	static int y = 20;

	static void disp(){
	
		System.out.println(x);
		System.out.println(y);
	}
}
class Client{

	public static void main(String[] args){
	
		System.out.println(StaticBlock.x);
		System.out.println(StaticBlock.y);
	}	
}
