// Maximum product of two numbers
// Given an array Arr of size N with all elements greater than or equal to zero. Return
// the maximum product of two numbers possible.
// Example 1:
// Input:
// N = 6
// Arr[] = {1, 4, 3, 6, 7, 0}
// Output: 42
// Example 2:
// Input:
// N = 5
// Arr = {1, 100, 42, 4, 23}
// Output: 4200
// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(1)
// Constraints:
// 2 ≤ N ≤ 10^7
// 0 ≤ Arr[i] ≤ 10^4
import java.io.*;
class MaxProdElem {

        static void maxEle(int arr[]){

		int max  = arr[0];
		int secMax = arr[arr.length-1];

		int reserveIndex = 0;
		for(int i=0;i<arr.length;i++){
			
			if(max < arr[i]){
				max = arr[i];
				reserveIndex = i;
			}
		}

		//System.out.println(reserveIndex);
		for(int i=0;i<arr.length;i++){
		
			if(i == reserveIndex){
				continue;
			}else if (secMax < arr[i]){
					secMax = arr[i];
			}
		}

		System.out.println("Maximum product of two numbers: " + max * secMax);
	}

	public static void main(String [] args)throws IOException{
        	
		System.out.println("\n\n\t\t\t......... Maximum product of two numbers ..........");
	
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

		maxEle(arr);
	}
}
