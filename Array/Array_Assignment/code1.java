//Program 1
//WAP to take size of array from user and also take integer elements from user Print sum
//of odd elements only
//input : Enter size : 5
//Enter array elements : 1 2 3 4 5
//output : 9
//1 + 3 + 5
import java.io.*;
class ArrayDemo{
	public static void main(String [] args)throws IOException{
		
		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Array Size:");
		int N = Integer.parseInt(Br.readLine());

		int arr[] = new int[N];

		int sum = 0;
		System.out.println("Enter Elements in array:");
		for(int i=0;i<arr.length;i++){
			arr[i] = Integer.parseInt(Br.readLine());
			if(arr[i] % 2 != 0){
				sum = sum + arr[i];
			}
		}
		System.out.println("Sum of odd elements : "+sum);
	}
}
