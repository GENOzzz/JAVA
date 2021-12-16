package test7_02;

public class grade {
	private String grade;
	private double score;
	public String getGrade() {return grade;}
	public void setGrade(String grade) {this.grade = grade;}
	public double getScore() {return score;}
	public void setScore(double score) {this.score = score;}

	grade (String grade){
		this.grade=grade;
		if(grade.equals("A")||grade.equals("a")) {
			this.score=4.0;
		}else if(grade.equals("B")||grade.equals("b")) {
			this.score=3.0;
		}else if(grade.equals("C")||grade.equals("c")) {
			this.score=2.0;
		}else if(grade.equals("D")||grade.equals("d")) {
			this.score=1.0;
		}else if(grade.equals("F")||grade.equals("f")) {
			this.score=0;
		}else {
			this.score=0;
		}
		
	}

}
