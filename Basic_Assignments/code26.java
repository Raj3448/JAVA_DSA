// Count pair sum
// Given two sorted arrays(arr1[] and arr2[]) of size M and N of distinct elements.
// Given a value Sum. The problem is to count all pairs from both arrays whose sum
// is equal to Sum.
// Note: The pair has an element from each array.
// Example 1:
// Input:
// M=4, N=4 , Sum = 10
// arr1[] = {1, 3, 5, 7}
// arr2[] = {2, 3, 5, 8}
// Output: 2
// Explanation: The pairs are: (5, 5) and (7, 3).
// Example 2:
// Input:
// N=4, M=4, sum=5
// arr1[] = {1, 2, 3, 4}
// arr2[] = {5, 6, 7, 8}
// Output: 0
// Expected Time Complexity: O(M+N).
// Expected Auxiliary Space: O(1).
// Constraints:
// 1 ≤ M, N ≤ 10^5
import java.io.*;
class CountPairSum {

        static void printCountPairSum(int arr1[],int[] arr2,int sum){

		
		for(int i=0;i<arr1.length;i++){
			
			for(int j=0;j<arr2.length;j++){
				if(arr1[i] + arr2[j] == sum){
					System.out.println("[ "+arr1[i]+" ,"+arr2[j]+ " ]");
				}
			}
		}
	}

	public static void main(String [] args)throws IOException{
        	
		System.out.println("\n\n\t\t\t......... Count pair sum ..........");
	
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Array1 Size:");
		int n = Integer.parseInt(br.readLine());	
		int arr1[] = new int[n];
		
		System.out.println("Enter elements in array1:");
		for(int i=0;i<n;i++){
 
			arr1[i] = Integer.parseInt(br.readLine());	
		}
		System.out.println("Given Array1:");
		for(int data:arr1){

			System.out.print(data+" ");
		}
		System.out.println();

		System.out.println("Enter Array2 Size:");
		int n1 = Integer.parseInt(br.readLine());	
		int arr2[] = new int[n1];
		
		System.out.println("Enter elements in array2:");
		for(int i=0;i<n1;i++){
 
			arr2[i] = Integer.parseInt(br.readLine());	
		}
		System.out.println("Given Array2:");
		for(int data:arr2){

			System.out.print(data+" ");
		}
		System.out.println();

		System.out.println("Enter Sum:");
		int sum = Integer.parseInt(br.readLine());
		printCountPairSum(arr1,arr2,sum);
	}
}
