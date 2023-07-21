class MyStrlen{

	static int myStrlen(String str){
		
		char arr[] = str.toCharArray();

		int count = 0;
		for(int i=0;i<arr.length;i++){
			count++;
		}
		return count;
	}
	public static void main(String [] demo){
	
		String str1 = "Rajkumar";

		System.out.println(myStrlen(str1));
	}
}
