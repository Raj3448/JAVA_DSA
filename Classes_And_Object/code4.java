
class Project{

	String projName = "Self Expense Tracker";
	int NoOfEmply = 24;

	void task(){
	
		String ModuleName = "Design Architecture";

		System.out.println("Project Name -> "+projName);
		System.out.println("Numbers of Employees -> "+NoOfEmply);
		System.out.println("Module Name ->"+ModuleName);
	}
};

class Developer{

	public static void main(String [] args){
	
		Project obj = new Project();

		obj.task();
	}
};
