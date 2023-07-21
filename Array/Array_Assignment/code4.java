/*Program 4
Write a program, take 7 characters as an input , Print only vowels from the array
Input: a b c o d p e
Output : a o e*/
import java.util.*;
class ArrayDemo{
	
	public static void main(String[] args){
		
		Scanner sp = new Scanner(System.in);

		System.out.println("Enter Array Size:");
		int N = sp.nextInt();

		char arr[] = new char[N];

		System.out.println("Enter character elemnets in array:");
		for(int i=0;i<arr.length;i++){
			arr[i] = sp.next().charAt(0);
			if(arr[i] == 'a' || arr[i] == 'A'||arr[i] == 'O' || arr[i] == 'o'||arr[i] == 'E' || arr[i] == 'e'||arr[i] == 'I' || arr[i] == 'i'||arr[i] == 'u' || arr[i] == 'U'){
				System.out.println("Vowels : "+arr[i]);
			}
		}
	}
}
