// Check if pair with given Sum exists in Array (Two Sum)
import java.io.*;
class PairSum{


        static void printPairSum(int arr[],int x){

		boolean flag = false;
		for(int i=0;i<arr.length;i++){

			for(int j=i+1;j<arr.length;j++){
				if(x == arr[i] + arr[j]){

					System.out.println("Yes");
					flag = true;
					break;
				}
			}
		}

		if(flag == false){

			System.out.println("No");
		}

	}

	public static void main(String [] args)throws IOException{
        	
		System.out.println("\n\n\t\t\t......... Check if pair with given Sum exists in Array (Two Sum)  .........");
	
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

		System.out.println("Enter Number: ");

		int x = Integer.parseInt(br.readLine());

		System.out.println("Output:");
		printPairSum(arr,x);
	}
}
