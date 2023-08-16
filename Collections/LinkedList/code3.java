import java.util.Iterator;
import java.util.ArrayList;

class IteratorDemo {

	   public static void main(String[] args) {

       		   ArrayList al = new ArrayList();

			
       		   al.add(10);
		   al.add(20);		
       		   al.add(30); 
		   al.add(40);
	   	   System.out.println(al);
								  										Iterator itr = al.iterator(); // Corrected method name to 'iterator()'
								    
								                    
																		while (itr.hasNext()) {						                            														
																			var element = itr.next(); 
				if ("Rahul".equals(element)) { 
					itr.remove();
				}
				System.out.println(element);
								                                                                                           }
								                                                                                                }
								                                                                                                 }
								   
