
//when we create an object of class then automatically call goes to constructor
class Core2web{
	
	Core2web(){
	
		System.out.println("RCB");
	}

	public static void main(String [] args){
	
		Core2web obj1 = new Core2web();
		Core2web obj2 = new Core2web();
	}
}
