package java_js;
abstract class Shape{ //추상클래스 Shape.
	Point p;
	
	Shape(){
		p=new Point(0,0);
	}
	
	Shape(Point p){
		this.p=p;
	}
	
	abstract double calcArea();//도형의 면적을 계산해서 반환하는 메소드
	
	Point getPosition() {
		return p;
	}
	
	void setPosition(Point p) {
		this.p=p;
	}
}

class Circle extends Shape{ //추상클래스 Shape를 상속받는 Circle 클래스 선언
	double r;//반지름
	Circle(double r){ //Circle생성자
		this.r=r;
	}
	double calcArea() {
		return r*r*(Math.PI);
	}
}

class Rectangle extends Shape{//추상클래스 Shape를 상속받는  Rectangle 클래스 선언
	double width,height;//폭,높이
	
	Rectangle(double width,double height){//Rectangle 생성자
		this.width=width;
		this.height=height;
	}
	
	double calcArea() {
		return width*height;
	}
	boolean isSquare() {
		if(width==height) return true;
		else return false;
	}
}

class Point{
	int x;
	int y;
	
	Point(){
		this.x=0;
		this.y=0;
	}
	
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	public String toString() {
		return "{"+x+","+y+"}";
	}
}



public class Exercise_7_23 {
	static double sumArea(Shape[]arr){	//Shape타입을 저장할수있는 배열 arr을 매개변수로 받는 sumArea()함수
		double sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i].calcArea();	//반복하면서 arr[i]번째의 calcArea()호출
		}
		return sum;
		
	}
	public static void main(String[] args) {
		Shape[]arr= {new Circle(5.0),new Rectangle(3,4),new Circle(1)};
		System.out.println("면적의 합 : " +sumArea(arr));
	}

}
