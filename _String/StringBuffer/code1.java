class Stringbuffer{

	public static void main(String [] args){


		StringBuffer str = new StringBuffer("Rajkumar");
		//String str = new String("Rajkumar");

		System.out.println(System.identityHashCode(str));

		str = str.append(" Chavan");
	//	str = str.concat(" Chavan");

		System.out.println(System.identityHashCode(str));
	}
}
