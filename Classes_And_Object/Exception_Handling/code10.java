class StackDemo{

	static void fun(int x){
			
			System.out.println(x);
			try{
				fun(++x);
				throw new StackOverflowError("Stack over flow");
			}catch(StackOverflowError obj){
			
				System.out.println(Thread.currentThread().getName()+":Stack over flow");
			}
	}
	public static void main(String [] args){
	
		fun(1);
	}
}
