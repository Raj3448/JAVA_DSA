//Positive and negative elements
//Given an array arr[ ] containing equal number of positive and negative elements,
//arrange the array such that every positive element is followed by a negative
//element.
//Note- The relative order of positive and negative numbers should be maintained.
//Example 1:
//Input:
//N = 6
//arr[] = {-1, 2, -3, 4, -5, 6}
//Output:
//2 -1 4 -3 6 -5
//Explanation: Positive numbers in order are 2, 4 and 6. Negative numbers in
//order are -1, -3 and -5. So the arrangement we get is 2, -1, 4, -3, 6 and -5.
//Example 2:
//Input:
//N = 4
//arr[] = {-3, 2, -4, 1}
//Output:
//2 -3 1 -4
//Expected Time Complexity: O(N)
//Expected Auxiliary Space: O(N)
//Constraints:
//1 ≤ N ≤ 10^6
//1 ≤ arr[i] ≤ 10^9

import java.io.*;
class PosNegElem {

        static void printPosNeg(int arr[]){

		int len = arr.length;

		int n1 = len/2;
		int n2 = len/2;

		int neg[] = new int[n1];
		int pos[] = new int[n2];
		
		int j = 0;
		int k = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i] < 0){
				neg[j] = arr[i];
				j++;
			}else{
				pos[k] = arr[i];
				k++;
			}
		}
		k = 0;
		j = 0;
		for(int i=0;i<arr.length;i++){

			if(i%2 == 0){
				arr[i] = pos[k];
				k++;
			}else{
				arr[i] = neg[j];
				j++;
			}
		}


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

		printPosNeg(arr);
		
		System.out.println("Output Array:");
		for(int data:arr){

			System.out.print(data+" ");
		}
		System.out.println();
	}
}
