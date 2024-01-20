//Q6. Product array puzzle
//Problem Description
//- Given an array of integers A, find and return the product array of the same
//size where the ith element of the product array will be equal to the
//
//product of all the elements divided by the ith element of the array.
//
//- Note: It is always possible to form the product array with integer (32 bit)
//values. Solve it without using the division operator.
//
//Constraints
//2 <= length of the array <= 1000
//1 <= A[i] <= 10
//For Example
//Input 1:
//A = [1, 2, 3, 4, 5]
//Output 1:
//[120, 60, 40, 30, 24]
class ProductPuzzleArray {

	public static void main(String [] args){

		int arr[] = new int[]{1,2,3,4,5};

		int N = arr.length;

		int prefixArr[] = new int[N];
		int suffixArr[] = new int[N];

		int prefix = 1;
		for(int i=0;i<N;i++){
			prefixArr[i] = prefix;
			prefix = prefix * arr[i];
			//System.out.println(prefixArr[i]);
		}


		int suffix = 1;
		for(int j=N-1;j>=0;j--){
			suffixArr[j] = suffix;
			suffix = suffix * arr[j]; 
			//System.out.println(suffixArr[j]);
		}

		for(int i=0;i<N;i++){

			System.out.println(prefixArr[i]*suffixArr[i]+" = "+prefixArr[i]+" X "+suffixArr[i]);
		}
	}
}
