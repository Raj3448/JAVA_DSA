//Product of minimum and maximum element in an first array and second array
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
        	
		System.out.println("\n\n\t\t\t.........Product of maximum and minimum element in an array..........");
	
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Array1 Size:");
		int n = Integer.parseInt(br.readLine());	
		int arr[] = new int[n];
		
		System.out.println("Enter Array2 Size:");
		int n1 = Integer.parseInt(br.readLine());	
		int arr1[] = new int[n1];
		
		System.out.println("Enter elements in array1:");
		for(int i=0;i<n;i++){
 
			arr[i] = Integer.parseInt(br.readLine());	
		}
		System.out.println("Given Array:");
		for(int data:arr){

			System.out.print(data+" ");
		}
		System.out.println();
		System.out.println("Enter elements in array2:");
		for(int i=0;i<n;i++){
 
			arr1[i] = Integer.parseInt(br.readLine());	
		}
		System.out.println("Given Array:");
		for(int data:arr1){

			System.out.print(data+" ");
		}
		System.out.println();
		int min = minEle(arr);
		int max = maxEle(arr1);

		System.out.println("Product of Minimun and Maximum elements of array : "+ min*max);

		br.close();
	}
}
