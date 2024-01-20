//Search an Element in an array
import java.io.*;
class SearchElem{

	static{
		System.out.println("\n\n\t\t\t---------Search an Element in an array--------");
	}
	static int searchEle(int arr[],int search){

		for(int i=0;i<arr.length;i++){
			if(search == arr[i]){
				return i;
			}
		}
		return -1;
	}
	public static void main(String [] args)throws IOException{
	
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
		System.out.println("Enter Search Element:"); 
		int search = Integer.parseInt(br.readLine());

		
		int ret = searchEle(arr,search);

		if(ret != -1){
			System.out.println("Element found at " + ret +"th index");
		}else{
			System.out.println("Element not found.");
		}
	}
}
