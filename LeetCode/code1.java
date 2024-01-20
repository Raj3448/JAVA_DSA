//Reverse Integer (Leetcode:- 7)
//
//Given a signed 32-bit integer x, return x with its digits reversed. If reversing
//x causes the value to go outside the signed 32-bit integer range [-231, 231
//- 1], then return 0.
//Assume the environment does not allow you to store 64-bit integers (signed
//or unsigned).
//Example 1:
//Input: x = 123
//Output: 321
//Example 2:
//Input: x = -123
//Output: -321
//Example 3:
//Input: x = 120
//Output: 21
//
//Constraints:
//-231 <= x <= 231 - 1
import java.io.*;

class ReverseInteger {

	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number:");
		int num = Integer.parseInt(br.readLine());

		int max32_INT = Integer.MAX_VALUE;
		int min32_INT = Integer.MIN_VALUE;

		boolean isNegative = num < 0;
		if(isNegative){
			num = Math.abs(num);
		}
		int reversedNum = 0;
		while(num != 0){

			reversedNum = reversedNum*10 + num%10;
			num = num/10;
		}

		if(isNegative){

			reversedNum = -reversedNum;
		}

		if(reversedNum < min32_INT || reversedNum > max32_INT){

			System.out.println("Number is not an integer");
		}else{

			System.out.println("Output : " + reversedNum);
		}
	}
}
