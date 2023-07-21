class Demo1{

	int x = 10;
	protected int y = 20;   //access with in the same package and subclass


}
class Demo2{

	public static void main(String [] args){
	
		Demo1 obj = new Demo1();

		System.out.println(obj.x);
		System.out.println(obj.y);
	}
}
