//Q4. Time to equality
//Problem Description
//- Given an integer array A of size N.
//- In one second, you can increase the value of one element by 1.
//- Find the minimum time in seconds to make all elements of the array
//
//equal.
//
//Problem Constraints
//1 <= N <= 1000000
//1 <= A[i] <= 1000
//
//Example Input
//A = [2, 4, 1, 3, 2]
//Example Output
//8
class TimeToEquality {

	public static void main(String [] args) {
	
		int arr[] = new int[]{2,4,1,3,2};
		
		int timeInSec = 0;

		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			
			if(max<arr[i]){
				max = arr[i];
			}
		}
		for(int i=0;i<arr.length;i++){
			timeInSec = timeInSec + max-arr[i];
		}
		System.out.println("Time required in second : "+timeInSec);
	}
}
