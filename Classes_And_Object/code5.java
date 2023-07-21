class Macdi{

	int item = 5;
	String str = "frieze";

	Macdi(int item,String str){
	
		this.item = item;
		this.str = str;
	}

	void Menu(){
	
		String menu1 = "Veg";
		String menu2 = "Non-veg";

		System.out.println(item);
		System.out.println(str);
	}
} 
class User{

	public static void main(String []args){

		int item = 10;
		String str = "Choppsy";	
		Macdi obj = new Macdi(item,str);
		System.out.println(obj);
		obj.Menu();
	}
}
