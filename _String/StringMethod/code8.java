class CompareString{

	static int myCompareString(String str1,String str2){
		int len1 = str1.length();
		int len2 = str2.length();
		if(len1 != len2){
			return len1 - len2;
		}
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();

		for(int i=0;i<len1;i++){
			if(arr1[i] != arr2[i]){
				return arr1[i] - arr2[i];
			}
		}
		return 0;
	}
	public static void main(String [] args){
	
		String str1 = "ahashi";
		String str2 = new String("Shashi");


		System.out.println(myCompareString(str1,str2));
		System.out.println(str1.compareTo(str2));
		
	}
}
