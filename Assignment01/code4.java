//Problem Description
//- Given an integer array A containing N distinct integers, you have to find all
//the leaders in array A. An element is a leader if it is strictly greater than all
//
//the elements to its right side.
//
//NOTE: The rightmost element is always a leader.
//Problem Constraints
//1 <= N <= 105
//1 <= A[i] <= 108
//
//Example Input
//Input 1:
//A = [16, 17, 4, 3, 5, 2]
//Input 2:
//A = [5, 4]
//
//Example Output
//Output 1:
//[17, 2, 5]
//Output 2:
//[5, 4]
//
//Example Explanation
//Explanation 1:
//Element 17 is strictly greater than all the elements on the right side to it.
//Element 2 is strictly greater than all the elements on the right side to it.
//Element 5 is strictly greater than all the elements on the right side to it.
class LeadersInArray {

	public static void main(String [] args){

		int arr[] = new int[]{16,17,4,3,5,2};
		
		int max = arr[arr.length-1];
			System.out.println(max);
		for(int i=arr.length-1;i>=0;i--){
			
			if(max < arr[i]){
				System.out.println(arr[i]);
				max = arr[i];
			}
		}	
	}
}
