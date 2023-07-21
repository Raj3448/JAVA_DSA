class Demo{

	int x = 10;

	Demo(){
		this(10);	
		System.out.println("In No argu Constrctor");
	}
	Demo(int x){
		
		//this();
		System.out.println("In Para Constructor");
	}

	public static void main(String[] args){
	
		Demo obj1 = new Demo();

	}
}
