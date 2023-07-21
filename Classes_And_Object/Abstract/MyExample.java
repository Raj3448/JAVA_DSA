abstract class ExamHall {

	void Questions(){
	
		System.out.println("Questions");
	}
	abstract void AnswerSheet();
}
class Student extends ExamHall {

	void AnswerSheet(){
	
		System.out.println("Answers");
	}
}
