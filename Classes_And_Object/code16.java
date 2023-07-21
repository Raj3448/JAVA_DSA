class Demo{

	public static void main(String[]args){
	
		String str1 = "raj";
		String str2 = new String("raj");
		String str3 = "Chavan";
		StringBuffer str4 = new StringBuffer("Chavan");

		System.out.println(System.identityHashCode(str4));
		System.out.println(str4);

		str4 = str4.append("raj");
		System.out.println(str4);

		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}
}
