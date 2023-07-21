//F 5 D 3 B 1
//F 5 D 3 B 1
//F 5 D 3 B 1
//F 5 D 3 B 1
class Pattern{
	public static void main(String [] args){
		for(int i=1;i<=4;i++){
			char ch = 'F';
			int n = 6;
			for(int j=1;j<=6;j++){
				if(j%2==0){
					System.out.print(n+" ");
				}else{
					System.out.print(ch+" ");
				}
				n--;
				ch--;
			}
			System.out.println();
		}
	}
}
