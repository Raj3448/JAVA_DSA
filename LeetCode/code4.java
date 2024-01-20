//Day-2
//1. Palindrome Number(LeetCode 9)
//Given an integer x, return true if x is a palindrome, and false otherwise.
//Example 1:
//Input: x = 121
//Output: true
//Explanation: 121 reads as 121 from left to right and from right to left.
//Example 2:
//Input: x = -121
//Output: false
//Explanation: From left to right, it reads -121. From right to left, it becomes 121-.
//Therefore it is not a palindrome.
//Example 3:
//Input: x = 10
//Output: false
//Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
//
//Constraints:
//-231 <= x <= 231
class Demo{

	static boolean checkPallindrome(int N) {

		int maxInt = Integer.MAX_VALUE;
		int minInt = Integer.MIN_VALUE;

		boolean isNegative = N < 0;

		int temp;
		if(isNegative){

			temp = Math.abs(N);
		}else{
		
			temp = N;
		}
		
		int reverseNum = 0;
		while(temp != 0){

			reverseNum = reverseNum * 10 + (temp%10);
			temp = temp/10;
		}

		if(isNegative){
			reverseNum = -reverseNum;
		}

		if(reverseNum == N)
			return true;
		else
			return false;
	}

	public static void main(String [] args) {
	
		int N = -12321;
		System.out.println(checkPallindrome(N));
	}
}
