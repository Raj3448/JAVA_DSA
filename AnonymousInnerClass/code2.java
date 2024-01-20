//Lambda Expression
interface Developer {

	void lang();
}
class Client {

	public static void main(String [] args) {
	
		Developer obj = ()-> System.out.println("c,cpp,flutter,java");

		obj.lang();
	}
}
