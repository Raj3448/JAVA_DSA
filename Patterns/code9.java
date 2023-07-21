//      10                                                                                              //    I H                                                                                               //  7 6 5                                                                                               //D C B A     
class Pattern{

	public static void main(String [] args){

		int row = 4;
		int num = row*2+2;
		char ch = 'J';
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row-i;j++){
				System.out.print("\t");
			}
			for(int j=1;j<=i;j++){
				if(i%2==0){
					System.out.print(ch +"\t");
				}
				else{
					System.out.print(num +"\t");
				}
				num--;
				ch--;
			}
			System.out.println();
		}
	}
}
