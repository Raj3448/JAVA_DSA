import java.io.*;

class FileDemo {

	public static void main(String [] args)throws IOException{
	
		File obj1 = new File("FileHandling");

		obj1.mkdir();

		File obj2 = new File("core2web.txt");

		obj2.mkdir();
		System.out.println("For \"FileHandling\" Folder:");
		System.out.println(obj1.getName());
		System.out.println(obj1.getParent());
		System.out.println(obj1.getPath());
		System.out.println(obj1.getAbsolutePath());
		System.out.println(obj1.canRead());
		System.out.println(obj1.canWrite());
		System.out.println(obj1.isDirectory());
		System.out.println(obj1.isFile());
		System.out.println("For \"core2web.text\" File :");
		System.out.println(obj2.getName());
		System.out.println(obj2.getParent());
		System.out.println(obj2.getPath());
		System.out.println(obj2.getAbsolutePath());
		System.out.println(obj2.canRead());
		System.out.println(obj2.canWrite());
		System.out.println(obj2.isDirectory());
		System.out.println(obj2.isFile());
	}
}
