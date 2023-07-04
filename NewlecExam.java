import 객체_캡슐화_ex3_콘솔코드분리.Exam;

public class NewlecExam extends Exam {
	
	private int com;
	
	public NewlecExam() {
		this(0,0,0,0);
	}
	
	public NewlecExam(int kor, int math, int eng, int com) {
		
		super(kor, eng, math);
		this.com = com;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}
	
	@Override
	public int total() {
		
		return super.total()+com;
	}
	
	@Override
	public float avg() {
		
		return total()/4.0f;
	}
	
}
