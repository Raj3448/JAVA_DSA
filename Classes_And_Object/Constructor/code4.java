class Demo{

	private int jerNo = 0;
	private String Pname = null;

	Demo(int jerNo,String Pname){
	
		this.jerNo = jerNo;
		this.Pname = Pname;
	}
	
	void getData(){

		System.out.println(this.jerNo);
		System.out.println(this.Pname);
	}
}
class Client{

	public static void main(String[] args){
	
		Demo obj = new Demo(18,"Virat kohli");
		obj.getData();

		Demo obj1 = new Demo(7,"MS Dhoni");
		obj1.getData();
		
		Demo obj2 = new Demo(45,"Rohit Sharma");
		obj2.getData();

	}
}
