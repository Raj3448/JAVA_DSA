class StringDemo{

	public static void main(String [] args){
	
		String str1 = "Rajkumar";
		String str2 = "Chavan";

		String str3 = str1+str2;

		String str4 = str1.concat(str2);

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));	
	}
}
