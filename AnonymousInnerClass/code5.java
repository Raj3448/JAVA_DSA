//Lambda expression apply as a parameter
import java.util.*;

class Employee {

	String name = null;
	String compName = null;

	Employee(String name,String compName){

		this.name = name;
		this.compName = compName;
	}

	public String toString(){

		return "{" + name + " : " + compName + "}";
	}
}
class Client {

	public static void main(String [] args) {
	
		ArrayList al = new ArrayList();
		al.add(new Employee("Jeet","RV Constructions"));
		al.add(new Employee("Abhishek","Vaishnavi Constructions"));
		al.add(new Employee("Akshay","Apple"));
		al.add(new Employee("Tanmay","Microsoft"));
		al.add(new Employee("Raj","Google"));
		
		System.out.println(al);

		System.out.println("Sorting by employee names : ");
		Collections.sort(al,(Object obj1,Object obj2)->{

			return (((Employee)obj1).name.compareTo(((Employee)obj2).name));
		});
		System.out.println(al);
		
		System.out.println("Sorting by employee company's : ");
		Collections.sort(al,(Object obj1,Object obj2)->{

			return (((Employee)obj1).compName.compareTo(((Employee)obj2).compName));
		});
		System.out.println(al);
	}
}
