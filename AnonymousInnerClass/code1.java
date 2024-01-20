interface Developer {

	void lang();
}
class Client {

	public static void main(String [] args) {
	
		Developer obj = new Developer(){

			public void lang() {

				System.out.println("C,C++,Dart,Flutter");
			}
		};

		obj.lang();
	}
}
