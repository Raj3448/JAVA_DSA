//java support global static variable
//Because,when the code start to execute static variable initialize first under the static block which has first priority to push into stack frame
//all the static variable initializing in the static block and the static methods are not execute until they have call to explicit due to this we can't initoialize the static variable under the static method hence, java support global static variables
class StaticDemo{

	static int x = 10;

	static fun(){
	
		//static int x = 10;   //error : we cant't initialize static variable in methods
		System.out.println("Int fun");
		System.out.println(x);
	}
	public static void main(String[]args){
	
		static int x = 10;
	}
} 
