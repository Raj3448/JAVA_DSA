import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

class FileReaderDemo {

	    public static void main(String[] args) {

		            try {
				                
				    FileReader fr = new FileReader("/root/programming/java/java_dsa/FileHandling/core2web.txt");

				
				    int i = 1;
		
				    while (i != 22) {
					
					    int charCode = fr.read();

					    if (charCode == -1) {

						    break; 

					    }

					    char ch = (char)charCode;						
					    System.out.print(ch); 

					
					    i++;
				    }

				    fr.close();
																		                                                                                                    } catch (FileNotFoundException fnfe) {
																		                                                                                                                System.out.println("File not found: " + fnfe.getMessage());
																														    } catch (IOException ie) {
																															    System.out.println("An error occurred: " + ie.getMessage());
																														    }
																		                                                                                                                                                
	    }
		
}
																		   
