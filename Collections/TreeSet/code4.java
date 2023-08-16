import java.util.*;

class Employee implements Comparator<Employee>{

	String empName = null;
	int empId = 0;

	Employee(){
	}

	Employee(String empName, int empId) {
	
		this.empName = empName;
		this.empId = empId;
	}

	public int compare(Employee obj1,Employee obj2){

		return (obj1.empName).compareTo((obj2.empName));
	}
		

	public String toString() {
	
		return "{" + empName + ":" + empId + "}";
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

		System.out.println(al);

		Collections.sort(al,new Employee());
		
		System.out.println(al);
	}
}
