class Demo{

	public static void main(String [] args) {
	
		int N = 256946;

		while(N != 0){

			if((N%10) % 2 == 0){
				int mul = 1;
				for(int i=1;i<=N%10;i++){
					mul = mul * i;
				}

				System.out.println(mul);
			}
			N = N/10;
		}
	}
}
