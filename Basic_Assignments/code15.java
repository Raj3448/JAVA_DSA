// Sum of distinct elements
import java.io.*;
class DistSumElements{


        static void printDistSumEle(int arr[]){

		System.out.print("Sum of distinct: ");
		int max = arr[0];

		for(int i=0;i < arr.length;i++){

			if(arr[i] > max) {
			
				max = arr[i];
			}
		}

		int counterArr[] = new int[max + 1];
		
		for(int i=0;i<arr.length;i++) {

			counterArr[arr[i]]++;
		}
		int distinctSum = 0;
		for(int i=0;i<arr.length;i++){

			if(counterArr[arr[i]] != 0 ){
				distinctSum = distinctSum + arr[i];
				counterArr[arr[i]] = 0;
			}
		}
		System.out.println(distinctSum);
	}
	public static void main(String [] args)throws IOException{
        	
		System.out.println("\n\n\t\t\t......... Sum of distinct elements ..........");
	
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
		printDistSumEle(arr);
	}
}
