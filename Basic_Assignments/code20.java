//  First element to occur k times
import java.io.*;
class ElementsOccur_k_times{


        static void printEleOccurKtimes(int []arr,int x) {

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

			if(counterArr[arr[i]] == x){
				System.out.println(arr[i]);
				counterArr[arr[i]] = 0;
				flag = true;
			}
		}

		if(flag == false){

			System.out.println("No any element present "+ x + " times");
		}
	}
	public static void main(String [] args)throws IOException{
        	
		System.out.println("\n\n\t\t\t.........  First element to occur k times ..........");
	
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

		System.out.println("Enter Number:");
		int x = Integer.parseInt(br.readLine());

		System.out.println("Output:");
		printEleOccurKtimes(arr,x);
	}
}
