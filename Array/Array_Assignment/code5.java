/* arr[] = new int[N]i program ,take 10 input from the user and print only elements that are divisible by
 5.
 Input: 10 2 2 3 3 3 4 4 25 55
 Output: 10 25 55*/
import java.util.*;
class ArrayDemo{
	public static void main(String [] args){
		
		Scanner sp = new Scanner(System.in);

		System.out.println("Enter elements in array:");
		int N = sp.nextInt();

		int arr[] = new int[N];

		System.out.println("Enter elements in array:");
		for(int i=0;i<arr.length;i++){
			arr[i] = sp.nextInt();
		}
		System.out.println("Elements that are divisible by 5:");
		for(int i=0;i<arr.length;i++){
			if(arr[i] % 5 == 0)
				System.out.println(arr[i]);
		}

	}
}
