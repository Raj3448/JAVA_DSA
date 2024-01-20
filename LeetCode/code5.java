//2. Find the Index of the First Occurrence in a String(LeetCode 28)
//
//Given two strings needle and haystack, return the index of the first occurrence of needle
//in haystack, or -1 if needle is not part of haystack.
//Example 1:
//Input: haystack = "sadbutsad", needle = "sad"
//Output: 0
//Explanation: "sad" occurs at index 0 and 6.
//The first occurrence is at index 0, so we return 0.
//Example 2:
//Input: haystack = "leetcode", needle = "leeto"
//Output: -1
//Explanation: "leeto" did not occur in "leetcode", so we return -1.
//
//Constraints:
//1 <= haystack.length, needle.length <= 104
//haystack and needle consist of only lowercase English characters.
class FirstOccOfString {

	static int check_1_Occ(String hayStack,String needle){

		int flag = 0;
		for(int i=0;i<hayStack.length;i++){

			if(hayStack.charAt(i) == needle.charAt(0)){

				for(int j = i+1;j<needle.length;j++){

					if(hayStack.charAt(j) != needle.charAt(j)){
						flag = 1;
						break;
					}
				}
			}

			if(flag != 1){
				return i;
			}else{
				flag = 0;
			}
		}
		return -1;
	}
	public static void main(String [] args) {
	
		String hayStack = "sadbutsad";

		String needle = "sad";

		int retIndex = check_1_Occ(hayStack,needle);

		System.out.println(retIndex);
	}
}
