class SubsequenceGenerator {

			    
	public static int generateSubsequences(int[] arr) {
				            
		int n = arr.length;

		int sum = 0;		

		int maxOddSum = 0;
				   	    
		for (int i = 0; i < (1 << n); i++) {						 
			      			    
			System.out.print("[");		
			sum = 0;		
			boolean isFirst = true;				    
						    
			for (int j = 0; j < n; j++) {

				int num = i & (1 << j);
									          	
				//System.out.println("i = " + i + ",     j = "+ j +",      i & 1 << j = " +num);
						            
							    
				if ((i & (1 << j)) > 0) {
						                                                                                                                                 
					if (!isFirst) {
						                                                                                                                                                         
						System.out.print(", ");
						                                                                                                                                                               
					}
					System.out.print(arr[j]);
					sum = sum + arr[j];
					isFirst = false;
				}
			}
			System.out.println("]");

			if(maxOddSum <  sum){

				if(sum % 2 != 0){

					maxOddSum = sum;
				}
			}

		}

		return maxOddSum;
	}

	public static void main(String [] args) {
	
		int arr[] = {4,-3,3,-5};
		int ret = generateSubsequences(arr);

		System.out.println("Max Odd Sum : " +ret);
	}
}
