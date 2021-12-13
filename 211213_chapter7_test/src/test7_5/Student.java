package test7_5;

public class Student {
	private String name;
	private String department;
	private int id;
	private double grade;
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getDepartment() {return department;}
	public void setDepartment(String department) {this.department = department;}
	public int getId() {return id;}
	public void setId(int id) {this.id = id;}
	public double getGrade() {return grade;}
	public void setGrade(double grade) {this.grade = grade;}
	
	Student(String name,String department,int id,double grade){
		this.name=name;
		this.department=department;
		this.id=id;
		this.grade=grade;
	}
	
	Student(String department,int id,double grade){
		this.department=department;
		this.id=id;
		this.grade=grade;
	}
}
