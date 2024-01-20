//  Remove an Element at Specific Index from an Array
import java.io.*;
class RemoveArrayIndex{

        static void removeIndexEle(int arr[],int index){

		for(int i=index; i<arr.length-1;i++){

			 arr[i] = arr[i+1];
		}
		arr[arr.length-1] = 0;
	}

	public static void main(String [] args)throws IOException{
        	
		System.out.println("\n\n\t\t\t......... Remove an Element at Specific Index from an Array ..........");
	
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Array Size:");
		int n = Integer.parseInt(br.readLine());	
		int arr[] = new int[n];
		
		System.out.println("Enter elements in array:");
		fx Odd Sumor(int i=0;i<n;i++){
 
			arr[i] = Integer.parseInt(br.readLine());	
		}

		System.out.println("Given Array:");
		for(int data:arr){

			System.out.print(data+" ");
		}
		System.out.println();
		
		System.out.println("Which index do you wanna remove?");
		int index = Integer.parseInt(br.readLine());
		System.out.println("Output:");
		removeIndexEle(arr,index);
		System.out.println("Array after removed the index:");
		for(int data:arr){

			System.out.print(data+" ");
		}
		System.out.println();
		br.close();
	}
}
