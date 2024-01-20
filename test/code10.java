// WAP to check whether the given string is palindrome or not. 3 pts.
// Input 1 : malayalam
// Output 1 : It is palindrome String
// Input 2 : armstrong
// Output 2 : It is not a palindrome String
class StringDemo {

	public static void main(String [] args) {
	
		String str = "malyalam";
		boolean flag = false;

		int start = 0;
		int end = str.length() - 1;
		while(start < end){

			if(str.charAt(start) != str.charAt(end)){
				
				System.out.println("It is not pallindrome");
				flag = true;
				break;
			}
			start++;
			end--;
		}
		if(!flag){
			System.out.println("It is pallindrome");
		}
	}
}
