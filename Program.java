import 객체_캡슐화_ex3_콘솔코드분리.Exam;

public class Program {
	
	public static void main(String[] args) {
		NewlecExam exam = new NewlecExam(1,1,1,1);
		
		/*exam.setKor(10);
		exam.setEng(10);
		exam.setMath(10);
		exam.setCom(10); */
		
		System.out.println(exam.total());
		System.out.println(exam.avg());
		
	}

}
