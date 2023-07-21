//1  2 9  4                                                                                             //25 6 49 8                                                                                             //81 10 121 12                                                                                          //169 14 225 16
class Pattern{
	public static void main(String[] args){

		int num = 1;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(j%2==0){
					System.out.print(num++ +"\t");
				}else{
					System.out.print(+num*num++ +"\t");
				}
			}System.out.println();
		}
	}
}
