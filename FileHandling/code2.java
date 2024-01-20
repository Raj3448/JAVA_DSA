import java.io.*;
class FileHandlingdemo {

	public static void main(String [] args) {
	
		File obj1 = new File("/root/programming/java/java_dsa/FileHandling");

		System.out.println(obj1.exists());

		String[] files = obj1.list();

		int fCounter = 0;
		int dCounter = 0;

		for(String fileName:files){

			File fobj = new File(fileName);
			System.out.println(fobj.getName());
			if(fobj.isFile()){

				fCounter++;
			}
			if(fobj.isDirectory()){
				
				dCounter++;
			}
		}

		System.out.println("Files Count of java_dsa Folder: "+fCounter);
		System.out.println("Folders Count of java_dsa Folder: "+dCounter);
	}
}
