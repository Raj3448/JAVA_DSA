class Demo{

	int x = 10;
	int y = 20;

	Demo(){
		System.out.println("In Constructor");
	}

	public static void main(String []args){
	
		Demo obj1 = new Demo();
		Demo obj2 = new Demo();

		obj2.x = 78;

		boolean ret = obj2.equals(obj2);

		System.out.println(ret);
	}
}
