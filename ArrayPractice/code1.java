class ArrayDemo{

	public static void main(String [] args){
	
		int arr[] = new int[]{10,20,30,40,50,60};
		int N = arr.length;
		int i = 0;
		int j = N-1;

		while(i <= j){
		
			if(((N/2) == i ) && N%2!=0){

				System.out.println(arr[i]);
			}else{
				System.out.println(arr[i] + arr[j]);
			}

			i++;
			j--;
		}
	}
}
