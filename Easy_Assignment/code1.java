//Missing number in array
//Given an array of size N-1 such that it only contains distinct integers in the range of 1 to
//N. Find the missing element.
//Example 1:
//Input:
//N = 6
//A[] = {1,2,4,5,6}
//Output: 3
//Example 2:
//Input:
//N = 11
//A[] = {1,3,2,5,6,7,8,11,10,4}
//Output: 9
//Expected Time Complexity: O(N)
//Expected Auxiliary Space: O(1)
//Constraints:
//1 ≤ N ≤ 10
//6
//1 ≤ A[i] ≤ 10
//6
import java.io.*;
class MissingNumber {

	static void printMissingElements(int arr[]){
	
		System.out.println("Output: ");
		int max = arr[0];

		for(int i=0;i<arr.length;i++){
		
			if(max < arr[i])
				max = arr[i];
		}

		int counterArr[] = new int[max+1];

		for(int i=0;i<arr.length;i++){
			
			counterArr[arr[i]]++;
		}

		for(int i=0;i<counterArr.length;i++){
			
			if(counterArr[i] == 0)
				System.out.println(i);
		}
	}
	public static void main(String [] args)throws IOException{
	
		System.out.println("\n\t\t-------------------- Missing Number ----------------------");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Array Size:");
		int N = Integer.parseInt(br.readLine());

		int arr[] = new int[N];

		System.out.println("Enter Array elements:");

		for(int i=0;i<arr.length;i++){

			arr[i] = Integer.parseInt(br.readLine());
		}

		printMissingElements(arr);
	}
}
