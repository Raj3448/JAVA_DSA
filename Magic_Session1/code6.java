/*Write a program, and take two characters if these characters are equal then print them as it is but if
they are unequal then print their difference.
{Note: Consider Positional Difference Not ASCIIs}

Input: a p
Output: The difference between a and p is 15*/
import java.io.*;
class Pattern{
	public static void main(String [] args)throws IOException{
		
		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter two character:");
		char ch1 = (char)Br.read();
		Br.skip(1);
		char ch2 = (char)Br.read();

		if(ch1 == ch2){
			System.out.println(ch1+" "+ch2);
		}else{
			int c = ch2 - ch1;
			System.out.println("The difference between "+ch1+" and "+ch2+" is" +c);
		}
	}
}
