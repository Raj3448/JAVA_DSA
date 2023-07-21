class Player{

	private int jerNo = 0;
	private StringBuffer name = null;

	Player(int jerNo,String name){
		
		StringBuffer str1 = new StringBuffer(name);
		this.jerNo = jerNo;
		this.name = str1;

		System.out.println(this.name + " = "+System.identityHashCode(this.name));
		this.name = (this.name).append(" Cricketer");
		System.out.println(this.name + " = "+System.identityHashCode(this.name));
		System.out.println();
		System.out.println();

		System.out.println("In Constructor");
	}
	void info(){
	
		System.out.println(jerNo+ " = " +name);
	}
}
class Client{

	public static void main(String[]args){
	
		Player obj1 = new Player(18,"Virat");
		obj1.info();

		Player obj2 = new Player(7,"MSD");
		obj2.info();

		Player obj3 = new Player(45,"Rohit");
		obj3.info();
	}
}
