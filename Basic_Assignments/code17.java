// Find Subarray with given sum | Set 1 (Non-negative Numbers)
import java.io.*;
class SubArrRangeSum{


        static void rangeArrSum(int arr[],int start,int end){

		System.out.println("Sum between index of "+start+" and "+end+":");
		int sum = 0;
		for(int i=start;i<=end;i++){

			sum = sum + arr[i];
		}
		System.out.println("\n\t"+sum);
	}
	public static void main(String [] args)throws IOException{
        	
		System.out.println("\n\n\t\t\t......... Find Subarray with given sum | Set 1 (Non-negative Number) .........");
	
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

		System.out.println("Enter range of array you wanna sum ");

		int start = Integer.parseInt(br.readLine());
		int end = Integer.parseInt(br.readLine());

		System.out.println("Output:");
		rangeArrSum(arr,start,end);
	}
}
