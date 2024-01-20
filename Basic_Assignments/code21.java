// Exceptionally odd
import java.io.*;
class ElementsOccur_Odd_times{


        static void printEleOccurOddtimes(int []arr) {

		int max = arr[0];

		boolean flag = false;

		for(int i=0;i < arr.length;i++){

			if(arr[i] > max) {
			
				max = arr[i];
			}
		}

		int counterArr[] = new int[max + 1];
		
		for(int i=0;i<arr.length;i++) {

			counterArr[arr[i]]++;
		}

		for(int i=0;i<arr.length;i++){

			if(counterArr[arr[i]] % 2 != 0){
				System.out.println(arr[i]);
				counterArr[arr[i]] = 0;
				flag = true;
			}
		}

		if(flag == false){

			System.out.println("No any element present odd number of times");
		}
	}

	public static void main(String [] args)throws IOException{
        	
		System.out.println("\n\n\t\t\t......... Exceptionally odd ..........");
	
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
		printEleOccurOddtimes(arr);
	}
}
