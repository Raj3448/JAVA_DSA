import java.util.*;

class Employee {

	String empName = null;
	int empId = 0;

	Employee(String empName, int empId) {
	
		this.empName = empName;
		this.empId = empId;
	}

	public String toString() {
	
		return "{" + empName + ":" + empId + "}";
	}
}

class SortByEmpName implements Comparator{

	public int compare(Object obj1,Object obj2){

		return -(((Employee)obj1).empName.compareTo(((Employee)obj2).empName));
	}
}

class SortDemo {

	public static void main(String [] args) {
	
		ArrayList al = new ArrayList();

		al.add(new Employee("shashi",34));
		al.add(new Employee("rajkumar",45));
		al.add(new Employee("suhas",67));
		al.add(new Employee("gorakh",32));
		al.add(new Employee("vandana",67));
		al.add(new Employee("bhaiya",87));
		al.add(new Employee("Aishwarya",78));

		System.out.println(al);

		Collections.sort(al,new SortByEmpName());
		
		System.out.println(al);
	}
}
