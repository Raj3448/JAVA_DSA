//Search an minimum and maximum element in an array
import java.io.*;
class MinMaxElem{

        static int minEle(int arr[]){

		int min = arr[0];
		for(int i=0;i<arr.length;i++){
			if(min > arr[i])
				min = arr[i];
		}
		return min;
	}
	static int maxEle(int arr[]){

		int max = arr[0];
		for(int i=0;i<arr.length;i++){
			if(max < arr[i])
				max = arr[i];
		}
		return max;
	}
	public static void main(String [] args)throws IOException{
        	
		System.out.println("\n\n\t\t\t.........Search an maximum and minimum element in an array..........");
	
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
		int min = minEle(arr);
		int max = maxEle(arr);

	
			System.out.println("Minimun and Maximum elements in array are " + min + " & " + max + " respectively...");
	}
}
