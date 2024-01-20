//Minimum Product of k Integers
//Given an array of N positive integers. You need to write a program to print the
//minimum product of k integers of the given array.
//Note: Since output could be large, hence module 10^9+7 and then print answer.
//Example 1:
//Input : Arr[] = {1, 2, 3, 4, 5}, K = 2
//Output : 2
//Explanation:
//If we have an array [1, 2, 3, 4, 5]. We will get the minimum product after
//multiplying 1 and 2 that is 2.
//So, the answer is 2.
//Example 2:
//Input : Arr[] = {9, 10, 8}, K = 3
//Output : 720
//Expected Time Complexity: O(nlogn).
//Expected Auxiliary Space: O(1).
//Constraints:
//1 ≤ K, N ≤ 10^5
import java.io.*;
class MinProduct{

        static void printMinProd(int arr[],int k){

		int prod = 1;
		
		for(int i=0;i<k;i++){

			prod = prod * arr[i];
		}

		System.out.println("Product : "+ prod);
		
	}

	public static void main(String [] args)throws IOException{
        	
		System.out.println("\n\n\t\t\t.........Search an minimum and second minimum element in an array..........");
	
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Array Size:");
		int n = Integer.parseInt(br.readLine());	
		int arr[] = new int[n];
		
		System.out.println("Enter elements in array:");
		for(int i=0;i<n;i++){
 
			arr[i] = Integer.parseInt(br.readLine());	
		}
		System.out.println("Given Array:");
		for(int data:arr){

			System.out.print(data+" ");
		}
		System.out.println();

		System.out.println("Enter Number :");
		int k = Integer.parseInt(br.readLine());

		printMinProd(arr,k);
	}
}
