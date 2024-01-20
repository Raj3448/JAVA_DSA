//Ceil The Floor
//Given an unsorted array Arr[] of N integers and an integer X, find floor and ceiling
//of X in Arr[0..N-1].
//Floor of X is the largest element which is smaller than or equal to X. Floor of X
//doesn’t exist if X is smaller than the smallest element of Arr[].
//Ceil of X is the smallest element which is greater than or equal to X. Ceil of X
//doesn’t exist if X is greater than the greatest element of Arr[].
//Example 1:
//Input:
//N = 8, X = 7
//Arr[] = {5, 6, 8, 9, 6, 5, 5, 6}
//Output: 6 8
//Explanation:
//Floor of 7 is 6 and ceil of 7 is 8.
//Example 2:
//Input:
//N = 8, X = 10
//Arr[] = {5, 6, 8, 9, 6, 5, 5, 6}
//Output: 9 -1
//Explanation:
//Floor of 10 is 9 but ceil of 10 is not possible.
//Expected Time Complexity: O(N)
//Expected Auxiliary Space: O(1)
//Constraints :
//1 ≤ N ≤ 10^5Ceil The Floor
//Given an unsorted array Arr[] of N integers and an integer X, find floor and ceiling
//of X in Arr[0..N-1].
//Floor of X is the largest element which is smaller than or equal to X. Floor of X
//doesn’t exist if X is smaller than the smallest element of Arr[].
//Ceil of X is the smallest element which is greater than or equal to X. Ceil of X
//doesn’t exist if X is greater than the greatest element of Arr[].
//Example 1:
//Input:
//N = 8, X = 7
//Arr[] = {5, 6, 8, 9, 6, 5, 5, 6}
//Output: 6 8
//Explanation:
//Floor of 7 is 6 and ceil of 7 is 8.
//Example 2:
//Input:
//N = 8, X = 10
//Arr[] = {5, 6, 8, 9, 6, 5, 5, 6}
//Output: 9 -1
//Explanation:
//Floor of 10 is 9 but ceil of 10 is not possible.
//Expected Time Complexity: O(N)
//Expected Auxiliary Space: O(1)
//Constraints :
//1 ≤ N ≤ 10^5

import java.io.*;
class CeilFloor{

	static void sortedArr(int arr[]){

		for(int i=0;i<arr.length;i++){

			for(int j=i+1;j<arr.length;j++){

				if(arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
        static void findCeilFloor(int arr[],int x){

		int ceil = 0;
		int floor = 0;
		for(int i=0;i<arr.length;i++){

			if(arr[i] <= x)
				floor = arr[i];
		}

		for(int i=arr.length-1; i>=0; i--){

			if(arr[i] >= x)
				ceil = arr[i];
		}

		System.out.println("Ceil : "+ceil);
		System.out.println("Floor : "+floor);
	}

	public static void main(String [] args)throws IOException{
        	
		System.out.println("\n\n\t\t\t.........  Ceil The Floor ..........");
	
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

		System.out.println("Enter the number to find ceil and floor: ");
		int x = Integer.parseInt(br.readLine());
		
		System.out.println("Output : ");
		sortedArr(arr);
		
		System.out.println("Sorted Array:");
		for(int data:arr){

			System.out.print(data+" ");
		}
		System.out.println();


		findCeilFloor(arr,x);

	}
}
