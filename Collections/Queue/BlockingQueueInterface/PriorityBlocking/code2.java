import java.util.concurrent.*;

class Employee implements Comparable{

	String str = null;
	int id = 0;
	Employee(String str,int id){

		this.str = str;
		this.id = id;
	}

	public String toString() {

		return "{" + str + ":" + id + "}";
	}

	public int compareTo(Object obj) {

		return str.compareTo(((Employee)obj).str);
	}
}
class Client {

	public static void main(String [] args)throws InterruptedException{
	
		PriorityBlockingQueue pbq = new PriorityBlockingQueue();

		pbq.put(new Employee("rajkumar",22));
		pbq.put(new Employee("suhas",24));
		pbq.put(new Employee("viraj",25));
		pbq.put(new Employee("uday",25));
		pbq.put(new Employee("yash",26));
		pbq.put(new Employee("samarth",27));
	/*	
		pbq.put("rajkumar");
		pbq.put("suhas");
		pbq.put("viraj");
		pbq.put("uday");
		pbq.put("yash");
		pbq.put("samarth");
	*/
		System.out.println(pbq);
	}
}
