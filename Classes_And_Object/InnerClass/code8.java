class Outer{

	void fun(){
	
		System.out.println("In outer fun");
	}
}
class Demo{

	public static void main(String []args){
	
		Outer obj = new Outer(){

			void fun(){
			
				System.out.println("In Demo$1.class fun");
			}
			void gun(){
			
				System.out.println("In gun");
			}
		}obj.gun();
		
	}
}
