class Demo {

	public static void fun(String [] args) {
	
		String str1 = "Rajkumar";
		String str2 = "Rajkumar";

		if(str1 == str2){
			System.out.println("Equal");
		}
	}
}
class Client {


	public static void main(String [] args){
	
		Demo obj1 = new Demo();
		Demo obj2 = new Demo();
		Demo obj3 = obj1;

		if(obj1 == obj2){
			System.out.println("Equal");
		}
		if(obj3 == obj1){

			System.out.println(obj3);
			System.out.println(obj1);
			System.out.println("Equal3");
		}

	}
}
