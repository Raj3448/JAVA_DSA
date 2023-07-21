class Demo{

	int x = 10;
	Demo(){
	
		System.out.println("In Constructor");
	}
	void fun(){
	
		System.out.println(x);
	}
	public static void main(String[]args){
	
		Demo obj = new Demo();
		obj.fun();
	}
}
