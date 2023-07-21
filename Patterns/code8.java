//3 2 1                                                                                                 //c b a                                                                                                 //3 2 1                                                                                                 //c b a
class Pattern{
	public static void main(String []args){

		int col = 3;
		int row = col+1;
		for(int i=1;i<=row;i++){
			char ch = 'c';
			int num = col;
			for(int j=1;j<=col;j++){
				if(i%2==1){
					System.out.print(+num-- +"\t");
				}else{
					System.out.print(ch-- +"\t");
				}
			}
			System.out.println();
		}
	}
}
