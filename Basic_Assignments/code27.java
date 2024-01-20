//  28] Remove Duplicates from unsorted array
//  Given an array of integers which may or may not contain duplicate elements. Your
//  task is to remove duplicate elements, if present.
//  Example 1:
//  Input:
//  N = 6
//  A[] = {1, 2, 3, 1, 4, 2}
//  Output:
//  1 2 3 4
//  Example 2:
//  Input:
//  N = 4
//  A[] = {1, 2, 3, 4}
//  Output:
//  1 2 3 4
//  Expected Time Complexity: O(N)
//  Expected Auxiliary Space: O(N)
//  Constraints:
//  1<=N<=10^5
//  1<=A[i]<=10^5
import java.io.*;
class RemoveDuplicates{


	static void sort(int [] arr){

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

        static int[] removeDuplicate(int []arr) {

		int max = arr[0];
		
		for(int i=0;i<arr.length;i++){

			if(max < arr[i]){
			
				max = arr[i];
			}
		}

		int arr1[] = new int[arr.length];
		int counterArr[] = new int[max+1];

		for(int i=0;i<arr.length;i++){

			counterArr[arr[i]]++;
		}

		int j = 0;
		for(int i=0;i<arr.length;i++){

			if(counterArr[arr[i]] >= 1){

				arr1[j++] = arr[i];
				counterArr[arr[i]] = 0;
			}
		}

		return arr1;
			
	}
	public static void main(String [] args)throws IOException{
        	
		System.out.println("\n\n\t\t\t.........  Remove Duplicate ..........");
	
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

		System.out.println("Output:");
		arr = removeDuplicate(arr);

		System.out.println("Filtered Array:");
		sort(arr);
		for(int data:arr){

			System.out.print(data+" ");
		}
	}
}
