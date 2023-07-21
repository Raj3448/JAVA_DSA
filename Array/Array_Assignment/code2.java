/*Program 2
WAP to take size of array from user and also take integer elements from user Print
product of even elements only
input : Enter size : 9
Enter array elements : 1 2 3 2 5 10 55 77 99
output : 40
2 * 2 * 10*/
import java.io.*;
class ArrayDemo{
	public static void main(String [] args)throws IOException{

		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Array Size:");
		int N = Integer.parseInt(Br.readLine());
			
		int arr[] = new int[N];

		int mul = 1;
		System.out.println("Enter elements in array:");
		for(int i=0;i<arr.length;i++){
			arr[i] = Integer.parseInt(Br.readLine());
			if(arr[i] % 2 == 0)
				mul = mul*arr[i];
		}

		System.out.println("Product of even: "+mul);
	}
}
