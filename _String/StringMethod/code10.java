class FindStringIndex{

	static int MyindexOf(String str1,char ch,int index){
		
		char arr[] = str1.toCharArray();
		
		if(arr.length <= index)
			return -1;

		for(int i=index;i<arr.length;i++){
			if(arr[i] == ch){
				return i;
			}
		}
		return -1;
	}
	public static void main(String [] args){
	
		String str1 = "Rajkumar";
		
		System.out.println(str1.indexOf('u',8));
		System.out.println(MyindexOf(str1,'u',8));
	}
}
