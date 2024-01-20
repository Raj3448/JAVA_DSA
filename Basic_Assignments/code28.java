//Find the closest number
//Given an array of sorted integers. The task is to find the closest value to the given
//number in the array. Arrays may contain duplicate values.
//Note: If the difference is same for two values print the value which is greater than
//the given number.
//Example 1:
//Input : Arr[] = {1, 3, 6, 7} and K = 4
//Output : 3
//Explanation:
//We have an array [1, 3, 6, 7] and the target is 4. If we look at the absolute
//difference of target with every element of an array we will get [ |1-4|, |3-4|,
//|6-4|, |7-4| ].
//So, the closest number is 3.
//Example 2:
//Input : Arr[] = {1, 2, 3, 5, 6, 8, 9}, K = 4
//Output : 5
//Expected Time Complexity: O(log(N)).
//Expected Auxiliary Space: O(1).
//Constraints:
//1 ≤ N ≤ 10^5
//1 ≤ K ≤ 10^5
//1 ≤ A[i] ≤ 10^5
import java.io.*;
class ClosestNumber{

        static void printClosestNumber(int arr[],int num){


		int min = 0;
		int max = 0;

		for(int i=0;i<arr.length;i++){

			if(arr[i] <= num){
				min = arr[i];
			}

			if(arr[i] > num){
				max = arr[i];
				break;
			}

		}

		if(num - min < max - num){

			System.out.println("The closest number : " +min);
		}else{

			System.out.println("The closest number : " +max);
		}
	}

	public static void main(String [] args)throws IOException{
        	
		System.out.println("\n\n\t\t\t.........Closest element in an array..........");
	
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

		System.out.println("Enter number for getting closest number to that number: ");
		int num = Integer.parseInt(br.readLine());

		printClosestNumber(arr,num);
	}
}
