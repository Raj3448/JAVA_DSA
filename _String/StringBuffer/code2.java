class StringbufferCapacity{

	public static void main(String [] args){
	
		StringBuffer str1 = new StringBuffer("Rajkumar Sanjay");
		StringBuffer str2 = new StringBuffer();
		str1 = str1.append(" chavan");
		
		System.out.println(str1.capacity());
		System.out.println(str2.capacity());

		System.out.println(str1);
		System.out.println(str1);
	}
}
