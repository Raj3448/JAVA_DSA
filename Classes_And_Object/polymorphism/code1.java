 class Demo{
 
	 int x = 10;

	 void info(){
	 
		 System.out.println("In No Argu");
	 }
	 void info(int x){
	 
		System.out.println("In para");
	 }
	 void info(float x){

		 System.out.println("IN Another para");
	 }
	 void info(Demo obj){

		 System.out.println("In Demo Para");
		 System.out.println(obj);
	 }

	 public static void main(String [] rags){
	 
		 Demo obj =  new Demo();
		 
		 obj.info();
		 obj.info(10);
		 obj.info(15.3f);
		 obj.info(obj);

		 System.out.println(obj);
	 }
} 
