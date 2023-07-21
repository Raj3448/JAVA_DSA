
class Demo{

	int x = 10;
	Demo(){
	
		System.out.println("In No Argument");
	}	
	Demo(int x){
		

		System.out.println("In para");
		System.out.println(this.x);
		System.out.println(x);
	}
	public static void main(String [] rags){
	
		Demo obj1 = new Demo();
		Demo obj2 = new Demo(42);
	}
}
