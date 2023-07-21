/*Program 10
WAP to print the elements whose addition of digits is even.
Ex. 26 = 2 + 6 = 8 (8 is even so print 26)
	Input :
	Enter array : 1 2 3 5 15 16 14 28 17 29 123
	Output: 2 15 28 17 123*/
import java.io.*;
class ArrayDemo{
	static int SumDigit(int num){
		int sum = 0;
		while(num != 0){
			sum = sum + num%10;
			num = num / 10;
		}
		return sum;
	}
	public static void main(String []Args)throws IOException{

		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Array Size:");
		int N = Integer.parseInt(Br.readLine());

		int arr[] = new int[N];

		System.out.println("Enter elements in array:");
		for(int i=0;i<arr.length;i++){
			arr[i] = Integer.parseInt(Br.readLine());
		}
		System.out.println("Output:");
		for(int i=0;i<arr.length;i++){
			if(SumDigit(arr[i]) % 2 == 0){
				System.out.println(arr[i]);
			}
		}
	}
}
