//WAP to reverse a number, and put successive number sum into an array and print it.

//Input : 45689
//Output : 17,14,11,9,4
class ArrayDemo {

			    
	public static void main(String[] args) {

				            
		int N = 45689;
					            
		int temp = N;
						            
		int count = 0;
			
		int reverseVal = 0;		
							            
		while (temp != 0) {
									                
			count++;					            
			temp = temp / 10;
												            
		}
								            
								            
		int arr[] = new int[count];
									            
		int k = 0;	
										    
		while (N != 0) {

			arr[k++] = N % 10;

			N = N / 10;

		}

		for (int i = 0; i < arr.length; i++) {

			if(i == arr.length-1){
				arr[i] = arr[i];
				break;
			}
			arr[i] = arr[i] + arr[i+1];
		}

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}		
		System.out.println();

	}
}
