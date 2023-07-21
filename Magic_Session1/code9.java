//Write a program to take a number as input and print the Addition of Factorials of each
//digit from that number.
//Input: 1234
//Output: Addition of factorials of each digit from 1234 = 33
import java.io.*;
class Solution{
	public static void main(String [] args)throws IOException{
		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Number:");
		int num = Integer.parseInt(Br.readLine());
		int temp = num;
		int sum = 0;
		while(num != 0){
			int mul = 1;
			for(int i=1;i<=num%10;i++){
				mul = mul*i;
			}
			sum = sum + mul;
			num = num/10;
		}
		System.out.println("Addition of factorial of each digit from "+temp+" = "+sum);
	}
}
