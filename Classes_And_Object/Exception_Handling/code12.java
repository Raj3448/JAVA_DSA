import java.util.*;
class DataOverFlow extends RuntimeException{

	DataOverFlow(String msg){
		
		super(msg);
	}
}
class DataUnderFlow extends RuntimeException{

	DataUnderFlow(String msg){
		
		super(msg);
	}
}
class Client{

	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array elements:");
		System.out.println("elements must be integer value in between 0 to 100");
		int arr[] = new int[5];

		for(int i=0;i<arr.length;i++){

			arr[i] = sc.nextInt();
			
			if(arr[i] < 0){

				throw new DataUnderFlow("Data underflow");
			}
			if(arr[i] > 100){

				throw new DataOverFlow("Data overflow");
			}
		}
		
		for(int i=0;i<arr.length;i++){		

			System.out.println(arr[i]);
		}
	}
}
