//Overloading
class Parent{

	void fun(int x,float y) {
	
		System.out.println("Int -FLoat");
	}
	void fun(float x,int y) {
	
		System.out.println("FLoat - int");
	}
	void fun(int x,double y) {
	
		System.out.println("Int -FLoat");
	}
	public static void main(String []args) {
	
		Parent obj = new Parent();
		obj.fun(10.5f,10);
		obj.fun(100,10);  //error -> ambiguous
	}
}
