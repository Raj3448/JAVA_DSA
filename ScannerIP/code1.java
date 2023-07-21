import java.util.Scanner;
class ScannerDemo{
	public static void main(String [] args){
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter self name:");
		String name = obj.next();

		System.out.println("Enter company name:");
		String compn = obj.next();

		System.out.println(name);
		System.out.println(compn);
	}
}
