class ShortestSubArrayLen {

	public static void main(String [] args) {
	
		int arr[] = new int[]{1,2,3,1,3,4,6,4,6,3};

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for(int i=0;i<arr.length;i++){

			if(max < arr[i]){
				max = arr[i];
			}
			if(min > arr[i]){
				min = arr[i];
			}
		}
		System.out.println(min);
		System.out.println(max);

		int count1 = arr.length;
		int count = 0;
		for(int i=0;i<arr.length;i++){

			for(int j=i;j<arr.length;j++){
			
					System.out.print("[ ");
					for(int k=i;k<=j;k++){

						System.out.print(arr[k] + ", ");
					}
					System.out.println("] ");
			}
		}


		System.out.println(count1);
	}
}
