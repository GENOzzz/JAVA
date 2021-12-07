package java_js;
abstract class Shape{ //�߻�Ŭ���� Shape.
	Point p;
	
	Shape(){
		p=new Point(0,0);
	}
	
	Shape(Point p){
		this.p=p;
	}
	
	abstract double calcArea();//������ ������ ����ؼ� ��ȯ�ϴ� �޼ҵ�
	
	Point getPosition() {
		return p;
	}
	
	void setPosition(Point p) {
		this.p=p;
	}
}

class Circle extends Shape{ //�߻�Ŭ���� Shape�� ��ӹ޴� Circle Ŭ���� ����
	double r;//������
	Circle(double r){ //Circle������
		this.r=r;
	}
	double calcArea() {
		return r*r*(Math.PI);
	}
}

class Rectangle extends Shape{//�߻�Ŭ���� Shape�� ��ӹ޴�  Rectangle Ŭ���� ����
	double width,height;//��,����
	
	Rectangle(double width,double height){//Rectangle ������
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
	static double sumArea(Shape[]arr){	//ShapeŸ���� �����Ҽ��ִ� �迭 arr�� �Ű������� �޴� sumArea()�Լ�
		double sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i].calcArea();	//�ݺ��ϸ鼭 arr[i]��°�� calcArea()ȣ��
		}
		return sum;
		
	}
	public static void main(String[] args) {
		Shape[]arr= {new Circle(5.0),new Rectangle(3,4),new Circle(1)};
		System.out.println("������ �� : " +sumArea(arr));
	}

}
