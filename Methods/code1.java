class Core2web{
	int x = 10;
	static int y = 20;
	void fun(){
		System.out.println("In Fun");
	}
	static void gun(){
		System.out.println("In Gun");
	}
	public static void main(String [] args){

		Core2web obj = new Core2web();

		System.out.println(obj.x);
		System.out.println(y);
		System.out.println("In main");
		obj.fun();
		gun();
	}
}
