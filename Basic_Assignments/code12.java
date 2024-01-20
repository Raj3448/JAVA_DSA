// First and last occurrences of X
import java.io.*;
class FirstLastOccurringElements{


        static int firstOccurance(int arr[],int x){

		for(int i=0;i < arr.length;i++){

			if(arr[i] == x)
				return i;
		}
		return -1;
	}
        static int lastOccurance(int arr[],int x){

		for(int i=arr.length-1; i>=0; i--){

			if(arr[i] == x)
				return i;
		}
		return -1;
	}
	public static void main(String [] args)throws IOException{
        	
		System.out.println("\n\n\t\t\t......... First and last occurrences of X ..........");
	
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Array Size:");
		int n = Integer.parseInt(br.readLine());	
		int arr[] = new int[n];
		
		System.out.println("Enter elements in array:");
		for(int i=0;i<n;i++){
 
			arr[i] = Integer.parseInt(br.readLine());	
		}
		System.out.println("Enter Number:");
		int x = Integer.parseInt(br.readLine());
		System.out.println("Given Array:");
		for(int data:arr){

			System.out.print(data+" ");
		}
		System.out.println();

		System.out.println("Output:");
		int first = firstOccurance(arr,x);

		if(first == -1){
			System.out.println("Number not present in array.");
		}else{
		
			System.out.println("First Occurance:" + first);
			int last = lastOccurance(arr,x);

			System.out.println("Last Ocurance: "+ last);
		}
	}
}
