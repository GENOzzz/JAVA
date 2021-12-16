package test7_08;

public class customer {
	private String name;
	private int point;
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getPoint() {return point;}
	public void setPoint(int point) {this.point = point;}

	customer(String name,int point){
		this.name=name;	
		this.point=point;
	}
	public void pluspoint(int newpoint) {
		point+=newpoint;
	}
	
	public String toString() {
		return "("+name+", "+point+")";
	}
}
