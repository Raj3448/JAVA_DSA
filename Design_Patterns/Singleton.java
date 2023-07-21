//Singleton Design pattern
class Singleton{

	static Singleton obj = new Singleton();
	
	private Singleton(){
	
		System.out.println("In Constructor");
	}

	static Singleton getObject(){
	
		return obj;
	}
}
class Client{

	public static void main(String[] ar){
	
		Singleton obj1 = Singleton.getObject();
		Singleton obj2 = Singleton.getObject();
		Singleton obj3 = Singleton.getObject();

		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
	}
}
