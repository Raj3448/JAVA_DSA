//1.Interface introduced for supporting multiple inheritance.
//2.and handling abstraction proper way , 
//3.In interface all methods are abstract methods, if we want to give body then those methods are using modifier keyword.
interface Demo1 {

	static void m1(){
	
		System.out.println("In M1 Demo1");
	}
}
interface Demo2 {

	static void m1(){
	
		System.out.println("In M1 Demo2");
	}
}
class Child implements Demo1,Demo2{


}
class Client{

	public static void main(String [] args){
		
		Demo1 obj = new Child();
		Demo1.m1();
	}
}
