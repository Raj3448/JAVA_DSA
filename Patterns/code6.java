//D4 C3 B2 A1                                                                                           //D4 C3 B2 A1                                                                                           //D4 C3 B2 A1                                                                                           //D4 C3 B2 A1 
class Pattern{

	public static void main(String[] args){

		int row = 4;
		for(int i=1;i<=row;i++){
		        char ch = 'D';
		        int num = row;
			for(int j=1;j<=row;j++){
				System.out.print(ch--);
				System.out.print(+num-- +"\t");
			}
			System.out.println();
		}
	}
}
