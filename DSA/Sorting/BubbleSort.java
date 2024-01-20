//Bubble Sort 
class BubbleSort {

	

	static int arr[] = {8,7,4,6,2,1};
	void sortWithBubble(){
	
		for(int i=0;i<arr.length;i++){

			for(int j = 0;j < arr.length - i-1 ; j++){

				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	public static void main(String [] args){
		
		BubbleSort bs = new BubbleSort();
		bs.sortWithBubble();
		
		System.out.println("Sorted array : ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
}
