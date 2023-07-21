class FinallyDemo{

	void m1(){
	
		System.out.println("In m1");
	}
	void m2(){
	
		System.out.println("In m2");
	}
	public static void main(String [] args){
	
		FinallyDemo obj = new FinallyDemo();
		obj.m1();
		obj = null;
		try{
			obj.m2();
		}
		/*catch(NullPointerException obj1){

			System.out.println("Exception Occured");

		}catch(RuntimeException obj2){
		
		}catch(Exception obj4){
		}*/finally{
		
			System.out.println("Connection closed");
		}

		System.out.println("End Main");
	}	
}
