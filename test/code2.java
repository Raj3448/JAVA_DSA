class ArmstrongNumber {

	static boolean isArmstrong(int N){
	
		int temp1 = N;
		int count = 0;
		while(temp1 != 0){
			count++;
			temp1 = temp1/10;
		}

		int temp2 = N;
		int sum = 0;
		while(temp2 != 0){

			int digit = temp2%10;
			int mul = 1;
			for(int i=1;i<=count;i++){
			
				mul = mul * digit;
			}
			sum = sum + mul;

			temp2 = temp2 / 10;
		}

		return (sum == N);
	}
	public static void main(String [] args) {
	
		int N = 153;

		boolean ret = isArmstrong(N);

		if(ret){

			System.out.println("Yes");
		}else{
		
			System.out.println("No");
		}
	}
}
