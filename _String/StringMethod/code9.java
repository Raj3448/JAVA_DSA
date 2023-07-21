class CompareIgnoreCase{

	static boolean CompareIgnoreCase(String str1,String str2){

		if(str1.length() != str2.length()){
			return false;
		}
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();

		for(int i=0;i<arr1.length;){
			
				if(arr1[i] == arr2[i] - 32 || arr1[i] == arr2[i] || arr1[i] == arr2[i] + 32){
					i++;
				}else{
					return false;
				}
		}
		return true;
	}
	public static void main(String [] args){
	
		String str1 = "Rajkunar";

		String str2 = "RAJKUMAR";

		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(CompareIgnoreCase(str1,str2));
	}
}
