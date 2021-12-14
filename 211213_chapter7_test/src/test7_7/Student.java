package test7_7;

public class Student {
	private String name;
	private double grade;
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public double getGrade() {return grade;}
	public void setGrade(int grade) {this.grade = grade;}
	
	Student(String name,double grade){
		this.name=name;
		this.grade=grade;
	}

}
