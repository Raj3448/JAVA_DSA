// Elements in the Range
import java.io.*;
class ElementAbsentException extends Exception{

	ElementAbsentException(String exp){

		super(exp);
	}
}
class ElemInRange{

	static int toggle = 0;

        static boolean searchBorderEle(int arr[],int start,int end)throws ElementAbsentException{

		int max = arr[0];

		for(int i=0;i < arr.length;i++){

			if(arr[i] > max) {
			
				max = arr[i];
			}
		}

		int counterArr[] = new int[max + 1];
		
		for(int i=0;i<arr.length;i++) {

			counterArr[arr[i]]++;
		}

		if(counterArr[start] == 0){

			throw new ElementAbsentException("Array does not contain "+ start); 
		}
		if(counterArr[end] == 0){

			throw new ElementAbsentException("Array does not contain "+ end);
		}
		
		return true;
	}
	static boolean availableBetweenRange(int arr[],int start,int end){

		if(end-start == 1 || start == end){
			
			toggle = 1;
			return false;
		}
		if(start > end){

			int temp = start;
			start = end;
			end = temp;
		}
		int count = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i] > start && arr[i] < end){

				count++;
			}
			if(count >= 1){

				return true;
			}
		}

		return false;

	}
	public static void main(String [] args)throws IOException{
        	
		System.out.println("\n\n\t\t\t......... Elements in the Range ..........");
	
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
		
		System.out.println("Enter start and end range:");
		int start = Integer.parseInt(br.readLine());
		int end = Integer.parseInt(br.readLine());

		try {
			boolean ret1 = searchBorderEle(arr,start,end);
	
			if(ret1 == true){
	
				boolean ret2 = availableBetweenRange(arr,start,end);

				System.out.println("Output ==>");
				if(ret2 == true){

					System.out.print("The element available in this range: ");
					System.out.println("Yes");
				}else if(ret2 == false && toggle == 1){

					System.out.println("Invalid range");
				}else{
				
					System.out.print("The element available in this range: ");
					System.out.println("No");
				}
			}
		}catch(ElementAbsentException eae){

			System.out.println(eae);
		}
	}
}
